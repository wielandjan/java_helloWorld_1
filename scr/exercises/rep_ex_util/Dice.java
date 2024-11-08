package exercises.rep_ex_util;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a dice that generates a random number between 1 and 6.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Dice {
    private static Random random = new Random();
    private List<Integer> dices = new ArrayList<>();

    public static List<Integer> wuerfeln(int value) {
        List<Integer> dices = new ArrayList<>();
        for (int i = 1; i < value; i++) {
            dices.add(random.nextInt(6) + 1);

        }
        return dices;

    }
}
