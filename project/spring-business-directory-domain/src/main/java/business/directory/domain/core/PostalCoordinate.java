package business.directory.domain.core;

/**
 * Created by Poulon on 31/12/2015.
 */
public class PostalCoordinate extends AbstractCoordinate {

    private final String pattern = "\\+6\\d{10}|06\\d{8}";

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
