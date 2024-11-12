package exercises.rep_ex_util;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a dice that generates a random number between 1 and 6.
 * Provides utility to roll a specified number of dice.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Dice {
    private static Random random = new Random();
    private List<Integer> dices = new ArrayList<>();

    /**
     * Rolls the specified number of dice and returns the results.
     * 
     * @param value the number of dice to roll
     * @return a list of integers representing the dice roll results
     */
    public static List<Integer> wuerfeln(int value) {
        List<Integer> dices = new ArrayList<>();
        // Roll each die up to the specified number and add results to the list
        for (int i = 1; i < value; i++) {
            dices.add(random.nextInt(6) + 1); // Generate a random number between 1 and 6
        }
        return dices;
    }
}
