package business.directory.domain.core;

/**
 * Created by cvaudry on 10/12/2015.
 */
public enum CoordinateType {
    private String name;

    CoordinateType(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
