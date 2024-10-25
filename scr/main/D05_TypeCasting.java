package main;

/**
 * Demonstrates type casting in Java, including widening and narrowing
 * conversions.
 * Provides examples of implicit and explicit type conversions.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D05_TypeCasting {
    public static void main(String[] args) {

        // Conversion order: byte -> short -> int -> long -> float -> double

        // Widening conversion / implicit type casting (type promotion)
        byte byte1 = 42; // Value 42 in binary: 00101010
        short short1 = byte1; // Promoted from byte, binary value: 00101010
        int int1 = short1; // Promoted from short, binary value: 00101010
        long long1 = int1; // Promoted from int, binary value: 00101010
        float float1 = long1; // Promoted from long, binary approximation in IEEE 754 format

        System.out.println("byte1: " + byte1);
        System.out.println("short1: " + short1);
        System.out.println("int1: " + int1);
        System.out.println("long1: " + long1);
        System.out.println("float1: " + float1);

        // Narrowing conversion / explicit type casting
        double double2 = 1.9; // Value in binary (approximation): 1.1110011001100110011001100110011...
        float float2 = (float) double2; // Narrowed to float, binary approximation as per IEEE 754

        System.out.println("double2: " + double2);
        System.out.println("float2: " + float2);

        // Type casting between char and int
        int int3 = 'A'; // ASCII value of 'A' is 65
        char char1 = 65; // Character represented by ASCII 65 is 'A'

        System.out.println("int3: " + int3);
        System.out.println("char1: " + char1);

    }

}
