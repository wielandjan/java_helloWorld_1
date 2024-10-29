package exercises;

import java.util.Scanner;

/**
 * A console application for adding two integers input by the user.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class ConsoleApplications01 {

    /**
     * Main method that reads two integer inputs from the user, adds them, and
     * displays the result.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        /* Initialize Scanner for user input */
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Addition von Ganzzahlen");
        System.out.println("");

        // Prompt for the first integer input
        System.out.print("Gib die erste Ganzzahl ein: ");
        int int1 = myScanner.nextInt();

        // Prompt for the second integer input
        System.out.print("Gib die zweite Ganzzahl ein: ");
        int int2 = myScanner.nextInt();

        int result = int1 + int2;

        // Display the result of the addition
        System.out.println("Das Ergebnis ist: " + int1 + " + " + int2 + " = " + result);

    }

}
