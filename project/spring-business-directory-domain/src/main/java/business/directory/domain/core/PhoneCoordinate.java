/*
 */
package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author TGITS
 */
@EqualsAndHashCode
@ToString
public class PhoneCoordinate extends AbstractCoordinate {

    private final String pattern = "\\+\\d{11}|0\\d{9}";

    public PhoneCoordinate() {
        super();
    }

    public PhoneCoordinate(String phoneNumber){
        super(phoneNumber);
    }

    public CoordinateType type() {
        return CoordinateType.PHONE;
    }

    protected String pattern() {
        return pattern;
    }

    protected String exceptionMessage() {
        return getValue() + " is not a valid phone number";
    }
}
