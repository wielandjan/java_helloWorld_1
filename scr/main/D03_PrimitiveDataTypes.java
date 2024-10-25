package main;

import java.math.BigDecimal;

/**
 * Demonstrates the usage of various primitive data types in Java,
 * including integer, character, and boolean types with examples
 * of initialization and binary, decimal, octal, hexadecimal, and Unicode
 * representation.
 * 
 * @version 1.0
 * @author Jan Wieland
 */
public class D03_PrimitiveDataTypes {

    /**
     * Main method demonstrating examples of Java primitive data types:
     * byte, short, int, long, char, and boolean. Prints values of
     * each type to the console, including character representations in
     * various formats.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        /* Integer types */
        byte byte1 = 42;
        short short1 = 4444;
        int int1 = 1_000_000_000;
        long long1 = 50_000_000_000L;

        System.out.println("byte1: " + byte1);
        System.out.println("short1: " + short1);
        System.out.println("int1: " + int1);
        System.out.println("long1: " + long1);

        /* Character types */
        char char1 = 'A'; // Symbol representation of 'A'
        char char2 = 0b1000001; // Binary representation of 'A'
        char char3 = 0101; // Octal representation of 'A'
        char char4 = 65; // Decimal representation of 'A'
        char char5 = 0x41; // Hexadecimal representation of 'A'
        char char6 = '\u0041'; // Unicode representation of 'A'

        System.out.println("char1: " + char1);
        System.out.println("char2: " + char2);
        System.out.println("char3: " + char3);
        System.out.println("char4: " + char4);
        System.out.println("char5: " + char5);
        System.out.println("char6: " + char6);

        /* Boolean type */
        boolean boolean1 = true;

        System.out.println("boolean1: " + boolean1);

        /* Floating-point types */
        float float1 = 1.1F;
        double double1 = 1.1;

        System.out.println("float1: " + float1);
        System.out.println("double1: " + double1);

        /* BigDecimal type */
        BigDecimal BigDecimal1 = new BigDecimal(0.1F);
        BigDecimal BigDecimal2 = new BigDecimal(0.1);

        System.out.println("BigDecimal1: " + BigDecimal1);
        System.out.println("BigDecimal2: " + BigDecimal2);
    }
}
