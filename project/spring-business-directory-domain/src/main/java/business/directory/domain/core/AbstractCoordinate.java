package business.directory.domain.core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.regex.Pattern;

/**
 * Created by TGITS on 31/12/2015.
 */
@EqualsAndHashCode
@ToString
public abstract class AbstractCoordinate implements Coordinate {
    private String value;

    public AbstractCoordinate() {
    }

    public AbstractCoordinate(String value) {
        setValue(value);
    }

    public abstract CoordinateType type();

    public String getValue() {
        return value;
    }

    public void setValue(String value) throws IllegalArgumentException {
        if (validate(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException(exceptionMessage());
        }
    }

    public boolean validate(String value) {
        return Pattern.matches(pattern(), value);
    }

    protected abstract String pattern();

    protected abstract String exceptionMessage();
}
