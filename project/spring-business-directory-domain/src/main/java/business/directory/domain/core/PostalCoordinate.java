package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by TGITS on 31/12/2015.
 */
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PostalCoordinate extends AbstractCoordinate {

    //valid characters : alphanumeric, spaces, -, ','
    private final String pattern = "(\\w|\\s|\\-|\\,)*";

    @Override
    public CoordinateType type() {
        return CoordinateType.POSTAL;
    }

    @Override
    protected String pattern() {
        return pattern;
    }

    @Override
    protected String exceptionMessage() {
        return getValue() + " is not a valid postal address";
    }
}
