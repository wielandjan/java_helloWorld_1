package main;

/**
 * Demonstrates the use of local variables and constants in Java.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D04_DataObjects {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Local variable examples representing data objects
        String name = "Maier";
        String firstName = "Hans";
        String familyName = "Maier";
        String fullName = "Hans Maier";

        double sizeInM = 1.8;
        double oldSizeInM = sizeInM;
        sizeInM = 1.78;

        System.out.println("sizeInM: " + sizeInM);
        System.out.println("oldSizeInM: " + oldSizeInM);

        /* Fixed data object */
        final String description = "Java";
        // description = "Python";
    }
}
