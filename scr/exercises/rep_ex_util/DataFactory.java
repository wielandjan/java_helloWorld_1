package exercises.rep_ex_util;

import java.util.List;
import java.util.ArrayList;

/**
 * DataFactory provides methods to create lists of weapons and fighters for
 * simulation purposes.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class DataFactory {

    /**
     * Creates a list of predefined weapons for different factions.
     * 
     * @return a list of weapons
     */
    public static List<Weapon> createWeapons() {
        List<Weapon> weapons = new ArrayList<>();

        // Space Marine Weapons
        weapons.add(new Weapon("Bolter", "Space Marine", WeaponTyp.Fernkampfwaffe, 5, 4, 6, 10));
        weapons.add(new Weapon("Kettenschwert", "Space Marine", WeaponTyp.Nahkampfwaffe, 3, 3, 7, 11));

        // Eldar Weapons
        weapons.add(new Weapon("Shuriken-Pistole", "Eldar", WeaponTyp.Fernkampfwaffe, 6, 4, 6, 11));
        weapons.add(new Weapon("Energie-Schwert", "Eldar", WeaponTyp.Nahkampfwaffe, 4, 3, 7, 12));

        // Ork Weapons
        weapons.add(new Weapon("Slugga", "Ork", WeaponTyp.Fernkampfwaffe, 5, 4, 7, 10));
        weapons.add(new Weapon("Choppa", "Ork", WeaponTyp.Nahkampfwaffe, 4, 4, 8, 11));

        // Tyranid Weapons
        weapons.add(new Weapon("Fleshborer", "Tyranid", WeaponTyp.Fernkampfwaffe, 5, 4, 7, 10));
        weapons.add(new Weapon("Bone Sword", "Tyranid", WeaponTyp.Nahkampfwaffe, 4, 5, 7, 11));

        // Astra Militarum Weapons
        weapons.add(new Weapon("Lasgun", "Astra Militarum", WeaponTyp.Fernkampfwaffe, 6, 3, 6, 10));
        weapons.add(new Weapon("Combat Knife", "Astra Militarum", WeaponTyp.Nahkampfwaffe, 4, 3, 7, 11));

        // Necron Weapons
        weapons.add(new Weapon("Gauss Blaster", "Necron", WeaponTyp.Fernkampfwaffe, 6, 4, 7, 12));
        weapons.add(new Weapon("Phase Blade", "Necron", WeaponTyp.Nahkampfwaffe, 5, 4, 8, 11));

        // Chaos Cultist Weapons
        weapons.add(new Weapon("Autogun", "Chaos Cultist", WeaponTyp.Fernkampfwaffe, 5, 4, 6, 11));
        weapons.add(new Weapon("Ritual Dagger", "Chaos Cultist", WeaponTyp.Nahkampfwaffe, 3, 3, 8, 10));

        return weapons;
    }

    /**
     * Creates a list of predefined fighters with associated attributes.
     * 
     * @return a list of fighters
     */
    public static List<Fighter> createFighters() {
        List<Fighter> fighters = new ArrayList<>();

        // Equip fighters with initial weapon
        fighters.add(new Fighter("Brother Voss", "Space Marine", 15, 2, 1));
        fighters.add(new Fighter("Shadowblade", "Eldar", 9, 3, 2));
        fighters.add(new Fighter("Gromm", "Ork", 12, 4, 3));
        fighters.add(new Fighter("Skarnak", "Chaos Cultist", 7, 5, 2));
        fighters.add(new Fighter("Ironhead", "Space Marine", 15, 2, 1));
        fighters.add(new Fighter("Wraithshade", "Necron", 11, 3, 1));
        fighters.add(new Fighter("Pistol Pete", "Astra Militarum", 8, 4, 2));
        fighters.add(new Fighter("Burna Boy", "Ork", 13, 4, 1));
        fighters.add(new Fighter("Zarak", "Tyranid", 10, 4, 1));

        return fighters;
    }
}
