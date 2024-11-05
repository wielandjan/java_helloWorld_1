package main;

import java.util.Locale;

/**
 * Demonstrates various console output methods and formatting in Java.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D10_ConsolenOutputs {

    /**
     * Main method to showcase print, println, and formatted output methods in
     * Java.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        /* print- and println-methods */
        System.out.println("Test 1");
        System.out.print("Test 2");
        System.out.print("Text 3");
        System.out.println("Text 4");
        System.out.println();

        /* printf method */
        // Format rule structure: %[flags][width][.precision] conversion character

        // String formatting (s)
        String text = "Hallo";
        String name = " Hans-Peter";
        System.out.printf("%s %s%n", text, name);
        System.out.printf("%S %S%n", text, name); // Uppercase conversion
        System.out.printf("%20s %s%n", text, name); // Define output width
        System.out.printf("%-20s %s%n", text, name); // Left-aligned output

        // Decimal number formatting (d)
        System.out.println(1_000_000_000);
        System.out.printf("%,d%n", 1_000_000_000); // Define thousand separator
        System.err.printf(Locale.JAPAN, "%,d%n", 1_000_000_000);

        // Floating-point number formatting (f)
        System.out.printf("%.2f%n", 3.8172645842); // Set precision
    }
}
