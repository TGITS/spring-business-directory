package business.directory.domain.core;

/**
 * Created by cvaudry on 10/12/2015.
 */
public enum CoordinateType {

    PHONE("Phone"),
    EMAIL("Email"),
    MOBILE("Mobile"),
    POSTAL("Postal");

    private String type;

    CoordinateType(String type) {
        this.type = type;
    }

    public String type() {
        return type;
    }
}
