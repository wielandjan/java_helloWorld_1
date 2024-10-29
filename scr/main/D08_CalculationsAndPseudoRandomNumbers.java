package main;

import java.util.Random;

/**
 * Class to demonstrate mathematical calculations and pseudo-random number
 * generation.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D08_CalculationsAndPseudoRandomNumbers {
    public static void main(String[] args) {

        /* Mathematical calculations */
        double result = Math.sqrt(64);
        System.out.println("result: " + result);

        /* Pseudo-random numbers */
        int randomNumber;

        // Using Math class to generate a random number between 0 and 99
        randomNumber = (int) (Math.random() * 100);
        System.out.println("randomNumber: " + randomNumber);

        // Using Random class to generate a random number between 1 and 100
        Random myRandom = new Random();
        randomNumber = myRandom.nextInt(1, 101);
        System.out.println("randomNumber: " + randomNumber);

    }

}
