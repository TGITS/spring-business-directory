/*
 */
package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author TGITS
 */
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PhoneCoordinate extends AbstractCoordinate {

    private final String pattern = "\\+\\d{11}|0\\d{9}";

    public PhoneCoordinate() {
        super();
    }

    public PhoneCoordinate(String phoneNumber) {
        super(phoneNumber);
    }

    @Override
    public CoordinateType type() {
        return CoordinateType.PHONE;
    }

    @Override
    protected String pattern() {
        return pattern;
    }

    @Override
    protected String exceptionMessage() {
        return getValue() + " is not a valid phone number";
    }
}
