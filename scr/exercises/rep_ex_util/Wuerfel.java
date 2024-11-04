package exercises.rep_ex_util;

import java.util.Random;

/**
 * Represents a dice that generates a random number between 1 and 6.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Wuerfel {
    public static Random random = new Random();

    /**
     * Rolls the dice and returns a random number between 1 and 6.
     * 
     * @return a random integer between 1 and 6
     */
    public static int wuerfeln() {
        return random.nextInt(6) + 1;
    }
}
