package main;

public class D04_DataObjects {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        /* gtp("(lokale) vars ( (lokale) var datenobjekte)" ) */
        String name = "Maier";
        String firstName = "Hans";
        String familyName = "Maier";
        String fullName = "Hans Maier";

        double sizeInM = 1.8;
        double oldSizeInM = sizeInM;
        sizeInM = 1.78;

        System.out.println("sizeInM: " + sizeInM);
        System.out.println("oldSizeInM: " + oldSizeInM);

        /* gpt(fixe Datenobjekte ( Konstaten)) */
        final double PI = 3.14159265359;
    }

}
