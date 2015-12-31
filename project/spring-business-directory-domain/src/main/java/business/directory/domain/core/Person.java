/*
 */
package business.directory.domain.core;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

/**
 *
 * @author TGITS
 */

@EqualsAndHashCode
@ToString
public class Person {
    private String name;
    private String forname;
    private EnumMap<CoordinateType,Coordinate> coordinateByType;

    public Person(String name, String forname) {
        this.name = name;
        this.forname = forname;
    }

    public void addCoordinate(Coordinate coordinate) {
        if (coordinateByType == null) {
            this.coordinateByType = new EnumMap<CoordinateType,Coordinate>(CoordinateType.class);
        }
        coordinateByType.put(coordinate.type(),coordinate);
    }

    public Coordinate fetchCoordinate(CoordinateType type) {
        if (coordinateByType != null) {
            return this.coordinateByType.get(type);
        }
        return null;
    }

    public int getNumberOfCoordinates(){
        if (coordinateByType != null) {
            return this.coordinateByType.size();
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }
}
