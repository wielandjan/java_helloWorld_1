package exercises;

import java.util.Scanner;
import exercises.rep_ex_util.Kaempfer;
import exercises.rep_ex_util.Spieler;
import exercises.rep_ex_util.Waffe;
import exercises.rep_ex_util.Wuerfel;

/**
 * Main class for the repetition exercise, simulating a simple turn-based combat
 * between two players. Prompts user input to create players and their fighters,
 * then executes one round of combat.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class repetition_exercise {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Create Player 1
        System.out.print("Geben Sie den Namen von Spieler 1 ein: ");
        String spieler1Name = scanner.nextLine();
        Spieler spieler1 = new Spieler(spieler1Name);

        System.out.print("Geben Sie den Namen des Kämpfers von Spieler 1 ein: ");
        String kaempfer1Name = scanner.nextLine();
        System.out.print("Geben Sie die Lebenspunkte des Kämpfers ein: ");
        int kaempfer1Lp = scanner.nextInt();
        System.out.print("Geben Sie den Verteidigungswert (VW) des Kämpfers ein: ");
        int kaempfer1Vw = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Geben Sie den Namen der Waffe von Spieler 1 ein: ");
        String waffe1Name = scanner.nextLine();
        System.out.print("Geben Sie den Angriffswert (AW) der Waffe ein: ");
        int waffe1Aw = scanner.nextInt();
        scanner.nextLine();

        Waffe waffe1 = new Waffe(waffe1Name, waffe1Aw);
        Kaempfer kaempfer1 = new Kaempfer(kaempfer1Name, kaempfer1Lp, kaempfer1Vw, waffe1);
        spieler1.setKaempfer(kaempfer1);

        // Create Player 2
        System.out.print("Geben Sie den Namen von Spieler 2 ein: ");
        String spieler2Name = scanner.nextLine();
        Spieler spieler2 = new Spieler(spieler2Name);

        System.out.print("Geben Sie den Namen des Kämpfers von Spieler 2 ein: ");
        String kaempfer2Name = scanner.nextLine();
        System.out.print("Geben Sie die Lebenspunkte des Kämpfers ein: ");
        int kaempfer2Lp = scanner.nextInt();
        System.out.print("Geben Sie den Verteidigungswert (VW) des Kämpfers ein: ");
        int kaempfer2Vw = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Geben Sie den Namen der Waffe von Spieler 2 ein: ");
        String waffe2Name = scanner.nextLine();
        System.out.print("Geben Sie den Angriffswert (AW) der Waffe ein: ");
        int waffe2Aw = scanner.nextInt();
        scanner.nextLine();

        Waffe waffe2 = new Waffe(waffe2Name, waffe2Aw);
        Kaempfer kaempfer2 = new Kaempfer(kaempfer2Name, kaempfer2Lp, kaempfer2Vw, waffe2);
        spieler2.setKaempfer(kaempfer2);

        // Round 1: Player 1 attacks Player 2
        System.out.println("*----------------*");
        System.out.println("* Runde 1, Zug 1 *");
        System.out.println("*----------------*");
        System.out.println(spieler1.kaempfer.getName() + ": " + spieler1.kaempfer.getLp() + " LP, " +
                spieler2.kaempfer.getName() + ": " + spieler2.kaempfer.getLp() + " LP\n");

        simuliereAngriff(spieler1, spieler2);

        // Round 2: Player 2 attacks Player 1
        System.out.println("*----------------*");
        System.out.println("* Runde 1, Zug 2 *");
        System.out.println("*----------------*");
        System.out.println(spieler1.kaempfer.getName() + ": " + spieler1.kaempfer.getLp() + " LP, " +
                spieler2.kaempfer.getName() + ": " + spieler2.kaempfer.getLp() + " LP\n");

        simuliereAngriff(spieler2, spieler1);
    }

    /**
     * Simulates an attack by one fighter on another, calculating hits, blocks, and
     * resulting damage.
     * 
     * @param angreifer   the attacking player
     * @param verteidiger the defending player
     */
    public static void simuliereAngriff(Spieler angreifer, Spieler verteidiger) {
        System.out.println(angreifer.kaempfer.getName() + " greift " + verteidiger.kaempfer.getName() + " mit "
                + angreifer.kaempfer.getWaffe().getName() + " an.");

        // Determine hits
        int treffer = 0;
        System.out.print(angreifer.kaempfer.getName() + " würfelt: ");
        for (int i = 0; i < angreifer.kaempfer.getWaffe().getAw(); i++) {
            int wurf = Wuerfel.wuerfeln();
            System.out.print(wurf + " ");
            treffer += wurf;
        }
        System.out.println("\n" + angreifer.kaempfer.getName() + " erzielt " + treffer + " Treffer.");

        // Determine blocks
        int blocks = 0;
        System.out.print(verteidiger.kaempfer.getName() + " würfelt: ");
        for (int i = 0; i < verteidiger.kaempfer.getVw(); i++) {
            int wurf = Wuerfel.wuerfeln();
            System.out.print(wurf + " ");
            blocks += wurf;
        }
        System.out.println("\n" + verteidiger.kaempfer.getName() + " erzielt " + blocks + " Blocks.");

        // Calculate and apply damage
        int schaden = Math.max(0, treffer - blocks);
        verteidiger.kaempfer.setLp(verteidiger.kaempfer.getLp() - schaden);
        System.out.println(verteidiger.kaempfer.getName() + " erleidet " + schaden + " Schaden und hat noch "
                + verteidiger.kaempfer.getLp() + " LP.\n");
    }

}
