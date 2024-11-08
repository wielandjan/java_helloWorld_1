package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import exercises.rep_ex_util.CombatActionTyp;
import exercises.rep_ex_util.DataFactory;
import exercises.rep_ex_util.Dice;
import exercises.rep_ex_util.Fighter;
import exercises.rep_ex_util.Player;
import exercises.rep_ex_util.Weapon;
import exercises.rep_ex_util.WeaponTyp;
import exercises.rep_ex_util.Dice;

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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Player[] players = new Player[2];

        initilizeGame(scanner, random, players);

        game(scanner, random, players);

    }

    public static void initilizeGame(Scanner scanner, Random random, Player[] players) {

        System.out.println("Willkommen bei Kill Team!");
        System.out.println("");

        System.out.print("Geben Sie den Namen von Spieler 1 ein: ");
        players[0] = new Player(scanner.nextLine());

        System.out.print("Geben Sie den Namen von Spieler 2 ein: ");
        players[1] = new Player(scanner.nextLine());

        List<Fighter> availableFighters = DataFactory.createFighters();

        System.out.println("");
        System.out.println("Willkommen zur Kämpfer-Auswahl!");

        // Jeder Spieler wählt 3 Kämpfer aus der Liste

        int playerRandom = (random.nextInt(2));

        for (int i = 0; i < 3; i++) {

            switch (playerRandom) {
                case 0:
                    System.out.println("");
                    System.out.printf("%s, wähle deinen Kämpfer %d :\n", players[0].getName(), (i + 1));
                    System.out.println("--------------------------------------");
                    players[0].setFighter(selectInitFighter(availableFighters, scanner, random));

                    System.out.println("");
                    System.out.printf("%s, wähle deinen Kämpfer %d :\n", players[1].getName(), (i + 1));
                    System.out.println("--------------------------------------");
                    players[1].setFighter(selectInitFighter(availableFighters, scanner, random));
                    break;
                case 1:
                    System.out.println("");
                    System.out.printf("%s, wähle deinen Kämpfer %d :\n", players[1].getName(), (i + 1));
                    System.out.println("--------------------------------------");
                    players[1].setFighter(selectInitFighter(availableFighters, scanner, random));

                    System.out.println("");
                    System.out.printf("%s, wähle deinen Kämpfer %d :\n", players[0].getName(), (i + 1));
                    System.out.println("--------------------------------------");
                    players[0].setFighter(selectInitFighter(availableFighters, scanner, random));
                    break;

                default:
                    break;
            }

        }
    }

    public static Fighter selectInitFighter(List<Fighter> availableFighters, Scanner scanner, Random random) {
        for (int i = 0; i < availableFighters.size(); i++) {
            Fighter fighter = availableFighters.get(i);
            System.out.println((i + 1) + ". " + fighter.getName() + " (" + fighter.getRace() + ") - LP: "
                    + fighter.getLp() + ", VW: " + fighter.getVw() + ", RW: " + fighter.getRw());
        }
        int choice = -1;
        while (choice < 1 || choice > availableFighters.size()) {
            System.out.println("");
            System.out.print("Bitte wähle einen Kämpfer durch Eingabe der Nummer: ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > availableFighters.size()) {
                System.out.println("Ungültige Auswahl. Bitte versuche es erneut.");
            }
        }

        // Entferne den gewählten Kämpfer aus der Liste der verfügbaren Kämpfer
        Fighter chosenFighter = availableFighters.remove(choice - 1);
        System.out.println("Du hast " + chosenFighter.getName() + " gewählt!");

        return chosenFighter;
    }

    public static void game(Scanner scanner, Random random, Player[] players) {

        for (int i = 1; i > 0; i++) {
            int playerRandom = (random.nextInt(2));
            int opponentRandom = (playerRandom == 0) ? 1 : 0;

            System.out.println("");
            System.out.println("---------------------------------");
            System.out.printf("%s beginnt mit seinem Angriff!\n", players[playerRandom].getName());

            for (int j = 1; j < 3; j++) {
                System.out.println("*----------------*");
                System.out.printf("* Runde %d, Zug %d\n *", i, j);
                System.out.println("*----------------*");
                System.out.println("");

                if (j == 1) {
                    simulateAttack(scanner, players[playerRandom], selectFighter(scanner, players[playerRandom]),
                            players[opponentRandom], selectFighter(scanner, players[opponentRandom]));
                } else {
                    simulateAttack(scanner, players[opponentRandom], selectFighter(scanner, players[opponentRandom]),
                            players[playerRandom], selectFighter(scanner, players[playerRandom]));
                }

            }
        }
    }

    public static void simulateAttack(Scanner scanner, Player attackPlayer, Fighter attacker, Player defendPlayer,
            Fighter defender) {

        System.out.println("");
        System.out.printf("%s greift mit %s (LP - %d) greift %s (LP - %d) von %s an!\n", attackPlayer.getName(),
                attacker.getName(), attacker.getLp(), defender.getName(), attacker.getLp(), defendPlayer.getName());

        attacker.setWeapon(selectAttackWeapon(scanner, attacker, attackPlayer));
        defender.setWeapon(setDefendWeapon(scanner, defender, attacker, defendPlayer));

        if (attacker.getWeapon().getTyp().equals(WeaponTyp.Fernkampfwaffe)) {
            simulateRangeAttack(attacker, defender);
            if (defender.getLp() <= 0) {
                defendPlayer.removeFighter(defender);
            }
        }
        if (attacker.getWeapon().getTyp().equals(WeaponTyp.Nahkampfwaffe)) {
            // simulateMeleeAttack(attacker, defender);
        }
    }

    public static Weapon selectAttackWeapon(Scanner scanner, Fighter fighter, Player player) {
        System.out.println("");
        System.out.printf("%s, wähle deine Waffe für %s :\n", player.getName(), fighter.getName());
        System.out.println("--------------------------------------");

        List<Weapon> availableWeapons = DataFactory.createWeapons();
        List<Weapon> raceWeapons = new ArrayList<>();

        for (int i = 0; i < availableWeapons.size(); i++) {

            Weapon weapon = availableWeapons.get(i);
            if (weapon.getRace().equals(fighter.getRace())) {
                raceWeapons.add(weapon);
            }
        }

        for (int i = 0; i < raceWeapons.size(); i++) {
            Weapon weapon = raceWeapons.get(i);
            System.out.println((i + 1) + ". " + weapon.getName() + " (" + weapon.getTyp() + ") - AW: "
                    + weapon.getAw() + ", BF_KG: " + weapon.getBF_KG() + ", KS: " + weapon.getKs() + ", SW: "
                    + weapon.getSw());
        }

        int choice = -1;
        while (choice < 1 || choice > raceWeapons.size()) {
            System.out.print("Bitte wähle eine Waffe durch Eingabe der Nummer: ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > raceWeapons.size()) {
                System.out.println("Ungsültige Auswahl. Bitte versuche es erneut.");
            }
        }

        Weapon chosenWeapon = (raceWeapons.get(choice - 1));
        System.out.println("Du hast " + chosenWeapon.getName() + " gewählt!");

        return chosenWeapon;

    }

    public static Weapon setDefendWeapon(Scanner scanner, Fighter fighter, Fighter opponend, Player player) {
        System.out.println("");
        System.out.printf("%s, wähle deine Waffe für %s :\n", player.getName(), fighter.getName());
        System.out.println("--------------------------------------");

        List<Weapon> availableWeapons = DataFactory.createWeapons();
        List<Weapon> raceWeapons = new ArrayList<>();
        List<Weapon> typRaceWeapons = new ArrayList<>();

        for (int i = 0; i < availableWeapons.size(); i++) {

            Weapon weapon = availableWeapons.get(i);
            if (weapon.getRace().equals(fighter.getRace())) {
                raceWeapons.add(weapon);
            }
        }

        for (int i = 0; i < raceWeapons.size(); i++) {

            Weapon weapon = raceWeapons.get(i);
            if (weapon.getTyp().equals(opponend.getWeapon().getTyp())) {
                typRaceWeapons.add(weapon);
            }
        }

        for (int i = 0; i < typRaceWeapons.size(); i++) {
            Weapon weapon = typRaceWeapons.get(i);
            System.out.println((i + 1) + ". " + weapon.getName() + " (" + weapon.getTyp() + ") - AW: "
                    + weapon.getAw() + ", BF_KG: " + weapon.getBF_KG() + ", KS: " + weapon.getKs() + ", SW: "
                    + weapon.getSw());
        }

        int choice = -1;
        while (choice < 1 || choice > typRaceWeapons.size()) {
            System.out.print("Bitte wähle eine Waffe durch Eingabe der Nummer: ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > typRaceWeapons.size()) {
                System.out.println("Ungsültige Auswahl. Bitte versuche es erneut.");
            }
        }

        Weapon chosenWeapon = (typRaceWeapons.get(choice - 1));
        System.out.println("Du hast " + chosenWeapon.getName() + " gewählt!");

        return chosenWeapon;

    }

    public static Fighter selectFighter(Scanner scanner, Player player) {
        System.out.println("");
        System.out.printf("%s, wähle deinen Kämpfer:\n", player.getName());
        System.out.println("--------------------------------------");

        for (int i = 0; i < player.getFighters().size(); i++) {
            Fighter fighter = player.getFighters().get(i);
            System.out.println((i + 1) + ". " + fighter.getName() + " (" + fighter.getRace() + ") - LP: "
                    + fighter.getLp() + ", VW: " + fighter.getVw() + ", RW: " + fighter.getRw());
        }
        int choice = -1;
        while (choice < 1 || choice > player.getFighters().size()) {
            System.out.println("");
            System.out.print("Bitte wähle einen Kämpfer durch Eingabe der Nummer: ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > player.getFighters().size()) {
                System.out.println("Ungültige Auswahl. Bitte versuche es erneut.");
            }
        }

        Fighter chosenFighter = player.getFighters().get(choice - 1);
        System.out.println("Du hast " + chosenFighter.getName() + " gewählt!");

        return chosenFighter;

    }

    public static void simulateRangeAttack(Fighter attacker, Fighter defender) {
        System.out.println("");
        System.out.printf("%s und %s haben gewürfelt:\n", attacker.getName(), defender.getName());

        List<Integer> attackDices = new ArrayList<>();
        List<CombatActionTyp> attackTyps = new ArrayList<>();

        List<Integer> defendDices = new ArrayList<>();
        List<CombatActionTyp> defendTyps = new ArrayList<>();

        attackDices = Dice.wuerfeln(attacker.getWeapon().getAw());
        defendDices = Dice.wuerfeln(defender.getVw());

        for (int i = 0; i < attackDices.size(); i++) {

            if (attackDices.get(i) < attacker.getWeapon().getBF_KG()) {
                attackTyps.add(CombatActionTyp.verfehlt);
            } else if (attackDices.get(i) >= attacker.getWeapon().getBF_KG()) {
                attackTyps.add(CombatActionTyp.Treffer);
            } else if (attackDices.get(i) == 6) {
                attackTyps.add(CombatActionTyp.Kritischer_Treffer);

            }
        }

        for (int i = 0; i < defendDices.size(); i++) {

            if (defendDices.get(i) < defender.getWeapon().getBF_KG()) {
                defendTyps.add(CombatActionTyp.verfehlt);
            } else if (defendDices.get(i) >= defender.getWeapon().getBF_KG()) {
                defendTyps.add(CombatActionTyp.Treffer);
            } else if (defendDices.get(i) == 6) {
                defendTyps.add(CombatActionTyp.Kritischer_Treffer);

            }
        }

        List<Integer> damages = new ArrayList<>();

        for (int i = 0; i < attackTyps.size() || i < defendTyps.size(); i++) {

            if (attackTyps.get(i) == CombatActionTyp.verfehlt
                    && (defendTyps.get(i) == CombatActionTyp.verfehlt || defendTyps.get(i) == CombatActionTyp.Block
                            || defendTyps.get(i) == CombatActionTyp.Kritischer_Block)) {
                damages.add(0);

            } else if (attackTyps.get(i) == CombatActionTyp.Treffer && defendTyps.get(i) == CombatActionTyp.verfehlt) {
                damages.add(attacker.getWeapon().getSw());

            } else if (attackTyps.get(i) == CombatActionTyp.Treffer && defendTyps.get(i) == CombatActionTyp.Block) {
                damages.add(0);

            } else if (attackTyps.get(i) == CombatActionTyp.Treffer
                    && defendTyps.get(i) == CombatActionTyp.Kritischer_Block) {
                damages.add(0);

            } else if (attackTyps.get(i) == CombatActionTyp.Kritischer_Treffer
                    && (defendTyps.get(i) == CombatActionTyp.verfehlt || defendTyps.get(i) == CombatActionTyp.Block)) {
                damages.add(attacker.getWeapon().getKs());

            } else if (attackTyps.get(i) == CombatActionTyp.Kritischer_Treffer
                    && defendTyps.get(i) == CombatActionTyp.Kritischer_Block) {
                damages.add(0);
            }
        }
        for (int i = 0; i < damages.size(); i++) {
            defender.setLp(defender.getLp() - damages.get(i));
        }

        System.out.println("");
        System.out.print(attacker.getName());
        System.out.print(" | ");
        for (int i = 0; i < attackTyps.size(); i++) {
            System.out.print(attackTyps.get(i) + " | ");
        }
        System.out.print("\n");

        System.out.print(defender.getName());
        System.out.print(" | ");
        for (int i = 0; i < defendTyps.size(); i++) {
            System.out.print(defendTyps.get(i) + " | ");
        }
        System.out.print("\n");

        for (int i = 0; i < attackTyps.size() || i < defendTyps.size(); i++) {
            System.out.print("____");
        }
        System.out.print("\n");

        System.out.print("Schaden");
        System.out.print(" | ");
        for (int i = 0; i < damages.size(); i++) {
            System.out.print(damages.get(i) + " | ");
        }
        System.out.print("\n");

        System.out.println("");
        if (defender.getLp() > 0) {
            System.out.printf("%s hat nach dem Fernangriff %d LP!");
        } else {
            System.out.printf("%s ist getötet worden!");
        }

    }

}
