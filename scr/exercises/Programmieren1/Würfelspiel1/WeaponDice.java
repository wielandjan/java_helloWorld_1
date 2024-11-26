package exercises.Programmieren1.Würfelspiel1;

import java.util.Random;

public class WeaponDice {
    public static Weapon weapon;

    public static void rollTheDice() {
        Random random = new Random();
        switch (random.nextInt(4) + 1) {
            case 1:
                weapon = Weapon.AXE;
                break;
            case 2:
                weapon = Weapon.CLUB;
                break;
            case 3:
                weapon = Weapon.SPEAR;
                break;
            case 4:
                weapon = Weapon.SWORD;
                break;
        }
    }
}
