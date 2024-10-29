package main;

/**
 * Demonstrates type casting and type conversion between different primitive
 * data types in Java.
 * 
 * This includes both implicit (widening) and explicit (narrowing) type
 * conversions.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D05_TypeCasting {

    public static void main(String[] args) {

        // Order: byte -> short -> int -> long -> float -> double

        // Expanding type conversion / Implicit type conversion (type promotion)
        byte byte1 = 42; // 42 (00101010)
        short short1 = byte1; // 42 (00000000 00101010)
        int int1 = short1; // 42 (00000000 00000000 00000000 00101010)
        long long1 = int1; // 42 (00000000 00000000 00000000 00000000 00000000 00000000 00000000 00101010)
        float float1 = long1; // 42.0 (01000010 00101000 00000000 00000000)
        double double1 = float1; // 42.0 (01000010 00101000 00000000 00000000 00000000 00000000 00000000
                                 // 00000000)

        System.out.println("byte1: " + byte1);
        System.out.println("short1: " + short1);
        System.out.println("int1: " + int1);
        System.out.println("long1: " + long1);
        System.out.println("float1: " + float1);
        System.out.println("double1: " + double1);

        // Restrictive type conversion / Explicit type conversion (type demotion)
        double double2 = 1.9; // 1.9 (00111111 11110011 01100110 01100110 01100110 01100110 01100110 01100110)
        float float2 = (float) double2; // 1.9 (00111111 11110011 01100110 01100110)
        long long2 = (long) double2; // 1 (00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001)
        int int2 = (int) long2; // 1 (00000000 00000000 00000000 00000001)
        short short2 = (short) int2; // 1 (00000000 00000001)
        byte byte2 = (byte) short2; // 1 (00000001)

        System.out.println("float2: " + float2);
        System.out.println("double2: " + double2);
        System.out.println("long2: " + long2);
        System.out.println("short2: " + short2);
        System.out.println("byte2: " + byte2);

        // Type conversion char <-> int
        int int3 = 'A'; // ASCII value of 'A' is 65
        char char1 = 65; // Character represented by ASCII code 65 is 'A'

        System.out.println("int3: " + int3);
        System.out.println("char1: " + char1);

    }

}
