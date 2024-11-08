package exercises.rep_ex_util;

import java.util.List;
import java.util.ArrayList;

public class DataFactory {

    public static List<Weapon> createWeapons() {
        List<Weapon> weapons = new ArrayList<>();

        // Space Marine Waffen
        weapons.add(new Weapon("Bolter", "Space Marine", "Fernkampfwaffe", 3, 4, 2, 4));
        weapons.add(new Weapon("Kettenschwert", "Space Marine", "Nahkampfwaffe", 2, 3, 3, 5));

        // Eldar Waffen
        weapons.add(new Weapon("Shuriken-Pistole", "Eldar", "Fernkampfwaffe", 4, 4, 2, 5));
        weapons.add(new Weapon("Energie-Schwert", "Eldar", "Nahkampfwaffe", 3, 3, 3, 6));

        // Ork Waffen
        weapons.add(new Weapon("Slugga", "Ork", "Fernkampfwaffe", 3, 5, 3, 4));
        weapons.add(new Weapon("Choppa", "Ork", "Nahkampfwaffe", 2, 4, 4, 5));

        // Tyranid Weapons
        weapons.add(new Weapon("Fleshborer", "Tyranid", "Fernkampfwaffe", 3, 5, 3, 4));
        weapons.add(new Weapon("Bone Sword", "Tyranid", "Nahkampfwaffe", 2, 6, 3, 5));

        // Astra Militarum Weapons
        weapons.add(new Weapon("Lasgun", "Astra Militarum", "Fernkampfwaffe", 4, 3, 2, 4));
        weapons.add(new Weapon("Combat Knife", "Astra Militarum", "Nahkampfwaffe", 1, 3, 3, 5));

        // Necron Weapons
        weapons.add(new Weapon("Gauss Blaster", "Necron", "Fernkampfwaffe", 4, 4, 3, 6));
        weapons.add(new Weapon("Phase Blade", "Necron", "Nahkampfwaffe", 3, 4, 4, 5));

        // Chaos Cultist Weapons
        weapons.add(new Weapon("Autogun", "Chaos Cultist", "Fernkampfwaffe", 3, 4, 2, 5));
        weapons.add(new Weapon("Ritual Dagger", "Chaos Cultist", "Nahkampfwaffe", 2, 3, 4, 4));

        return weapons;
    }

    public static List<Fighter> createFighters() {
        List<Fighter> fighters = new ArrayList<>();

        // Kämpfer mit einer Waffe ausstatten
        fighters.add(new Fighter("Brother Voss", "Space Marine", 18, 3, 3));
        fighters.add(new Fighter("Shadowblade", "Eldar", 12, 4, 5));
        fighters.add(new Fighter("Gromm", "Ork", 15, 5, 6));
        fighters.add(new Fighter("Skarnak", "Chaos Cultist", 10, 6, 5));
        fighters.add(new Fighter("Ironhead", "Space Marine", 18, 3, 4));
        fighters.add(new Fighter("Wraithshade", "Necron", 14, 4, 3));
        fighters.add(new Fighter("Pistol Pete", "Astra Militarum", 11, 5, 5));
        fighters.add(new Fighter("Burna Boy", "Ork", 16, 5, 4));
        fighters.add(new Fighter("Zarak", "Tyranid", 13, 5, 4));

        return fighters;
    }
}
