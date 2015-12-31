package business.directory.domain.core;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TGITS on 31/12/2015.
 */
public class PhoneCoordinateTest {

    /* Creating a correct PhoneCoordinate with the constructor */
    @Test
    public void createCorrectPhoneCoordinateWithConstructor() {
        List<String> numbers = DataGenerator.generateListOfFrenchPhoneNumber(20);
        List<PhoneCoordinate> phoneCoordinates = new ArrayList();
        for (String number : numbers) {
            phoneCoordinates.add(new PhoneCoordinate(number));
        }
    }

    /* Creating a correct PhoneCoordinate with the setter */
    @Test
    public void createCorrectPhoneCoordinateWithSetter() {
        List<String> numbers = DataGenerator.generateListOfFrenchPhoneNumber(20);
        List<PhoneCoordinate> phoneCoordinates = new ArrayList();
        for (String number : numbers) {
            PhoneCoordinate coordinate = new PhoneCoordinate();
            coordinate.setValue(number);
            phoneCoordinates.add(coordinate);
        }
    }

    @Test(expected=IllegalArgumentException.class)
    public void createIncorrectPhoneCoordinateWithConstructor() {
        List<String> numbers = DataGenerator.generateListOfFrenchPhoneNumber(20);
        //adding an incorrect number
        numbers.add("012345");

        List<PhoneCoordinate> phoneCoordinates = new ArrayList();
        for (String number : numbers) {
            phoneCoordinates.add(new PhoneCoordinate(number));
        }
    }

    /* Creating a correct PhoneCoordinate with the setter */
    @Test(expected=IllegalArgumentException.class)
    public void createIncorrectPhoneCoordinateWithSetter() {
        List<String> numbers = DataGenerator.generateListOfFrenchPhoneNumber(20);
        //adding an incorrect number
        numbers.add("0612345Abc");
        List<PhoneCoordinate> phoneCoordinates = new ArrayList();
        for (String number : numbers) {
            PhoneCoordinate coordinate = new PhoneCoordinate();
            coordinate.setValue(number);
            phoneCoordinates.add(coordinate);
        }
    }
}
