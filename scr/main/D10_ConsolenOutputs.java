package main;

import java.util.Locale;

public class D10_ConsolenOutputs {

    public static void main(String[] args) {

        /* print- und println-Methoden */
        System.out.println("Test 1");
        System.out.print("Test 2");
        System.out.print("Text 3");
        System.out.println("Text 4");
        System.out.println();

        /* printf-Methode */
        // Aufbau einer Formatierungsregel: %[flags][with][.precision] conversion
        // character

        // String-Formatierung (s)
        String text = "Hallo";
        String name = " Hans-Peter";
        System.out.printf("%s %s%n", text, name);
        System.out.printf("%S %S%n", text, name); // Großbuchstabenkonvertierung
        System.out.printf("%20s %s%n", text, name); // Festlegen der Ausgabewerte
        System.out.printf("%-20s %s%n", text, name); // linksbündige ausgabe

        // Dezimalzahlen-Formatierung (d)
        System.out.println(1_000_000_000);
        System.out.printf("%,d%n", 1_000_000_000); // Festlegen des Tausendertrannzeichen
        System.err.printf(Locale.JAPAN, "%,d%n", 1_000_000_000);

        // Gleitkommazahlen-Formatierung (f)
        System.out.printf("%.2f%n", 3.8172645842); // Festlegen der genauigkeit

    }
}
