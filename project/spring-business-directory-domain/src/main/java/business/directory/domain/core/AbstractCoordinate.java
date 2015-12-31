package business.directory.domain.core;

import java.util.regex.Pattern;

/**
 * Created by TGITS on 31/12/2015.
 */
public abstract class AbstractCoordinate implements Coordinate {
    private String value;

    public AbstractCoordinate() {
    }

    public AbstractCoordinate(String value) {
        setValue(value);
    }

    public abstract CoordinateType type();

    public void setValue(String value) throws IllegalArgumentException {
        if (validate(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException(exceptionMessage());
        }
    }

    public String getValue() {
        return value;
    }

    public boolean validate(String value) {
        return Pattern.matches(pattern(), value);
    }

    protected abstract String pattern();

    protected abstract String exceptionMessage();
}
