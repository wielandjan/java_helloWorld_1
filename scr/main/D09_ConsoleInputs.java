package main;

import java.util.Scanner;

/**
 * Class for handling console inputs and displaying output to the console.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D09_ConsoleInputs {

    /**
     * Main method to read integer input from the console and display it.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        /* Initialize Scanner */
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);

        // Read and display an integer
        System.out.print("Bitte gib eine ganze Zahl ein: ");
        int int1 = myScanner.nextInt();
        System.out.println("int1: " + int1);

        // Read and display a double value
        System.out.print("Bitte gib eine realle Zahl ein: ");
        double double1 = myScanner.nextDouble();
        System.out.println("double1: " + double1);

        // Read and display a boolean value
        System.out.print("Bitte gib einen Wahrheitswert ein: ");
        boolean boolean1 = myScanner.nextBoolean();
        System.out.println("boolean1: " + boolean1);

        // Read and display a single character
        System.out.print("Bitte gib genau ein Zeichen ein: ");
        char char1 = myScanner.next().charAt(0);
        System.out.println("char1: " + char1);

        // Read and display the first name
        System.out.print("Bitte gib deinen Vornamen ein: ");
        String firstName = myScanner.next();
        System.out.println("firstName: " + firstName);

        // Read and display the full name
        System.out.print("Bitte gib deinen vollständigen Namen ein: ");
        myScanner.nextLine(); // Clears the newline from previous input
        String fullName = myScanner.nextLine();
        System.out.println("fullName: " + fullName);

    }

}
