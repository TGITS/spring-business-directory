package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by TGITS on 31/12/2015.
 */
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class EmailCoordinate extends AbstractCoordinate {

    private final String pattern = "\\w+@\\w+\\.\\w+";

    public EmailCoordinate() {
    }

    public EmailCoordinate(String email) {
        super(email);
    }

    @Override
    public CoordinateType type() {
        return CoordinateType.EMAIL;
    }

    @Override
    protected String pattern() {
        return pattern;
    }

    @Override
    protected String exceptionMessage() {
        return getValue() + " is not a valid email";
    }
}
