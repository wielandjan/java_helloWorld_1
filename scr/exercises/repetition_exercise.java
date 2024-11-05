package exercises;

import java.util.Scanner;
import exercises.rep_ex_util.Fighter;
import exercises.rep_ex_util.Player;
import exercises.rep_ex_util.Weapon;
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
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name);

        System.out.print("Geben Sie den Namen des Kämpfers von Spieler 1 ein: ");
        String fighter1Name = scanner.nextLine();
        System.out.print("Geben Sie die Lebenspunkte des Kämpfers ein: ");
        int fighter1Lp = scanner.nextInt();
        System.out.print("Geben Sie den Verteidigungswert (VW) des Kämpfers ein: ");
        int fighter1Vw = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Geben Sie den Namen der Waffe von Spieler 1 ein: ");
        String weapon1Name = scanner.nextLine();
        System.out.print("Geben Sie den Angriffswert (AW) der Waffe ein: ");
        int weapon1Aw = scanner.nextInt();
        scanner.nextLine();

        Weapon weapon1 = new Weapon(weapon1Name, weapon1Aw);
        Fighter fighter1 = new Fighter(fighter1Name, fighter1Lp, fighter1Vw, weapon1);
        player1.setFighter(fighter1);

        // Create Player 2
        System.out.print("Geben Sie den Namen von Spieler 2 ein: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name);

        System.out.print("Geben Sie den Namen des Kämpfers von Spieler 2 ein: ");
        String fighter2Name = scanner.nextLine();
        System.out.print("Geben Sie die Lebenspunkte des Kämpfers ein: ");
        int fighter2Lp = scanner.nextInt();
        System.out.print("Geben Sie den Verteidigungswert (VW) des Kämpfers ein: ");
        int fighter2Vw = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Geben Sie den Namen der Waffe von Spieler 2 ein: ");
        String weapon2Name = scanner.nextLine();
        System.out.print("Geben Sie den Angriffswert (AW) der Waffe ein: ");
        int weapon2Aw = scanner.nextInt();
        scanner.nextLine();

        Weapon weapon2 = new Weapon(weapon2Name, weapon2Aw);
        Fighter fighter2 = new Fighter(fighter2Name, fighter2Lp, fighter2Vw, weapon2);
        player2.setFighter(fighter2);

        // Round 1: Player 1 attacks Player 2
        System.out.println("*----------------*");
        System.out.println("* Runde 1, Zug 1 *");
        System.out.println("*----------------*");
        System.out.println(player1.fighter.getName() + ": " + player1.fighter.getLp() + " LP, " +
                player2.fighter.getName() + ": " + player2.fighter.getLp() + " LP\n");

        simuliereAngriff(player1, player2);

        // Round 2: Player 2 attacks Player 1
        System.out.println("*----------------*");
        System.out.println("* Runde 1, Zug 2 *");
        System.out.println("*----------------*");
        System.out.println(player1.fighter.getName() + ": " + player1.fighter.getLp() + " LP, " +
                player2.fighter.getName() + ": " + player2.fighter.getLp() + " LP\n");

        simuliereAngriff(player2, player1);
    }

    /**
     * Simulates an attack by one fighter on another, calculating hits, blocks, and
     * resulting damage.
     * 
     * @param attacker the attacking player
     * @param defender the defending player
     */
    public static void simuliereAngriff(Player attacker, Player defender) {
        System.out.println(attacker.fighter.getName() + " greift " + defender.fighter.getName() + " mit "
                + attacker.fighter.getWaffe().getName() + " an.");

        // Determine hits
        int hits = 0;
        System.out.print(attacker.fighter.getName() + " würfelt: ");
        for (int i = 0; i < attacker.fighter.getWaffe().getAw(); i++) {
            int wurf = Wuerfel.wuerfeln();
            System.out.print(wurf + " ");
            hits += wurf;
        }
        System.out.println("\n" + attacker.fighter.getName() + " erzielt " + hits + " Treffer.");

        // Determine blocks
        int blocks = 0;
        System.out.print(defender.fighter.getName() + " würfelt: ");
        for (int i = 0; i < defender.fighter.getVw(); i++) {
            int wurf = Wuerfel.wuerfeln();
            System.out.print(wurf + " ");
            blocks += wurf;
        }
        System.out.println("\n" + defender.fighter.getName() + " erzielt " + blocks + " Blocks.");

        // Calculate and apply damage
        int demage = Math.max(0, hits - blocks);
        defender.fighter.setLp(defender.fighter.getLp() - demage);
        System.out.println(defender.fighter.getName() + " erleidet " + demage + " Schaden und hat noch "
                + defender.fighter.getLp() + " LP.\n");
    }

}
