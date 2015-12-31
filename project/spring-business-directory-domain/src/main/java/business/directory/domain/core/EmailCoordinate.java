package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Poulon on 31/12/2015.
 */
@EqualsAndHashCode
@ToString
public class EmailCoordinate extends AbstractCoordinate {

    private final String pattern = "\\w+@\\w+\\.\\w+";

    public EmailCoordinate() {
    }

    public EmailCoordinate(String email) {
        super(email);
    }

    public CoordinateType type() {
        return CoordinateType.EMAIL;
    }

    protected String pattern() {
        return pattern;
    }

    protected String exceptionMessage() {
        return getValue() + " is not a valid email";
    }
}
