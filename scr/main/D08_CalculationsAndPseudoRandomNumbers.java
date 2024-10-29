package main;

import java.util.Random;

public class D08_CalculationsAndPseudoRandomNumbers {
    public static void main(String[] args) {

        /* Mathematischen Berechnungen */
        double result = Math.sqrt(64);
        System.out.println("result: " + result);

        /* Pseudozufallszahlen */
        int randomNumber;

        // gpt("Cass Math")
        randomNumber = (int) (Math.random() * 100);
        System.out.println("randomNumber: " + randomNumber);

        // gpt("Class Random")
        Random myRandom = new Random();
        randomNumber = myRandom.nextInt(1, 101);
        System.out.println("randomNumber: " + randomNumber);

    }

}
