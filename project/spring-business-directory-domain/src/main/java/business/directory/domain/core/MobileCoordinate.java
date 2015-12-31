package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Poulon on 31/12/2015.
 */
@EqualsAndHashCode
@ToString
public class MobileCoordinate extends AbstractCoordinate {

    private final String pattern = "\\+6\\d{10}|06\\d{8}";

    public MobileCoordinate() {
    }

    public MobileCoordinate(String mobileNumber) {
        super(mobileNumber);
    }

    public CoordinateType type() {
        return CoordinateType.MOBILE;
    }

    protected String pattern() {
        return pattern;
    }

    protected String exceptionMessage() {
        return getValue() + " is not a valid mobile number";
    }
}
