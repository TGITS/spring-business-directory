package business.directory.domain.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by TGITS on 31/12/2015.
 */
public class DataGenerator {

    private final static Random random = new Random();

    public static List<String> generateListOfFrenchPhoneNumber(int maxValue) throws IllegalArgumentException {
        if (maxValue <= 0) {
            throw new IllegalArgumentException("you must provide a value greater than 0");
        }
        List<String> list = new ArrayList();

        int bound = random.nextInt(maxValue);
        for (int i = 0; i < bound; i++) {
            list.add(generateFrenchPhoneNumber());
        }
        return list;
    }

    public static String generateFrenchPhoneNumber() {
        //Generate a phone number following this pattern "\\+\\d{11}|0\\d{9}"
        StringBuilder number = new StringBuilder();

        if (random.nextBoolean()) {
            number.append("+");
            number.append(random.nextInt(10));
            number.append(random.nextInt(10));
        } else {
            number.append("0");
        }

        for (int i = 0; i < 9; i++) {
            number.append(random.nextInt(10));
        }

        return number.toString();
    }

}
