package exercises;

import java.util.Scanner;

/**
 * ConsoleApplications01
 * <p>
 * A simple console application that reads two integers from the user,
 * calculates
 * the percentage of the first integer relative to the second, and outputs the
 * result.
 * </p>
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class ConsoleApplications02 {

    /**
     * Main method that executes the console application.
     * <p>
     * Reads two integers from the user, calculates the percentage of the first
     * integer
     * relative to the second integer, and displays the result.
     * </p>
     *
     * @param args Command-line arguments (not used).
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

        double result = ((double) int1 / (double) int2) * 100;

        // Display the result of the calculation
        System.out.println("Das Ergebnis ist: " + int1 + " von " + int2 + " sind " + result + "%");
    }
}
