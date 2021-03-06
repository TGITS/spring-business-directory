package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by TGITS on 31/12/2015.
 */
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MobileCoordinate extends AbstractCoordinate {

    private final String pattern = "\\+6\\d{10}|06\\d{8}";

    public MobileCoordinate() {
    }

    public MobileCoordinate(String mobileNumber) {
        super(mobileNumber);
    }

    @Override
    public CoordinateType type() {
        return CoordinateType.MOBILE;
    }

    @Override
    protected String pattern() {
        return pattern;
    }

    @Override
    protected String exceptionMessage() {
        return getValue() + " is not a valid mobile number";
    }
}
