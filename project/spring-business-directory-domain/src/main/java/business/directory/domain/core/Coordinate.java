package business.directory.domain.core;

/**
 * Created by TGITS on 10/12/2015.
 */
public interface Coordinate {

    CoordinateType type();

    String getValue();

    void setValue(String value) throws IllegalArgumentException;

    boolean validate(String value);
}
