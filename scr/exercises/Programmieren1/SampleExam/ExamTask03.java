package exercises.Programmieren1.SampleExam;

import java.util.Scanner;

public class ExamTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Produkt eingeben: ");
            String product = scanner.nextLine();

            System.out.println("Verfügbarkeit prüfen...");
            if (Product.isAvailible(product) != null) {
                System.out.println("Produkt ist verfügbar.");
                System.out.println("Der Kaufpreis ist: " + Product.isAvailible(product).getPrice() + "€");
                System.out.print("Möchte sie das Produkt kaufen Ja= [true] Nein =[false]? ");
                boolean buy = scanner.nextBoolean();
                if (buy) {
                    System.out.println("Bezahlung ...");
                    System.out.println("Vorgang abgeschlossen.");
                } else {
                    System.out.println("Abbruch ...");
                    System.out.println("Vorgang abgebrochen.");
                }
            } else {
                System.out.println("Produkt ist nicht verfügbar.");
            }

            System.out.print("Neues Produkt suchen [1] oder verlassen [2] ? ");
            int choise = scanner.nextInt();
            if (choise == 2) {
                exit = true;
                System.out.println("Verlassen ...");
            }
        }

        scanner.close();
    }

}
