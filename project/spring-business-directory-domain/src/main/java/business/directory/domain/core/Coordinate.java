package business.directory.domain.core;

/**
 * Created by TGITS on 10/12/2015.
 */
public interface Coordinate {

    CoordinateType type();
    void setValue(String value);
    String getValue();
    boolean validate();
}
