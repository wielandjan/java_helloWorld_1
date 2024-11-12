package exercises.rep_ex_util;

/**
 * Represents a weapon with attributes such as name, race, type, and attack
 * characteristics.
 * Provides methods to access weapon details.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Weapon {
    private String name;
    private String race;
    private WeaponTyp typ;
    private int aw; // Attack power of the weapon
    private int BF_KG; // Ballistic skill or combat skill level
    private int sw; // Standard damage level
    private int ks; // Critical damage level

    /**
     * Constructs a new weapon with the specified attributes.
     * 
     * @param name  the name of the weapon
     * @param race  the faction or race associated with the weapon
     * @param typ   the type of weapon (ranged or melee)
     * @param aw    the attack power of the weapon
     * @param BF_KG the ballistic skill or combat skill of the weapon
     * @param sw    the standard damage inflicted by the weapon
     * @param ks    the critical damage inflicted by the weapon
     */
    public Weapon(String name, String race, WeaponTyp typ, int aw, int BF_KG, int sw, int ks) {
        this.name = name;
        this.race = race;
        this.typ = typ;
        this.aw = aw;
        this.BF_KG = BF_KG;
        this.sw = sw;
        this.ks = ks;
    }

    /**
     * Returns the name of the weapon.
     * 
     * @return the name of the weapon
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the race associated with the weapon.
     * 
     * @return the race of the weapon
     */
    public String getRace() {
        return race;
    }

    /**
     * Returns the type of the weapon.
     * 
     * @return the type of the weapon
     */
    public WeaponTyp getTyp() {
        return typ;
    }

    /**
     * Returns the attack power of the weapon.
     * 
     * @return the attack power of the weapon
     */
    public int getAw() {
        return aw;
    }

    /**
     * Returns the ballistic or combat skill level of the weapon.
     * 
     * @return the skill level associated with the weapon
     */
    public int getBF_KG() {
        return BF_KG;
    }

    /**
     * Returns the standard damage inflicted by the weapon.
     * 
     * @return the standard damage of the weapon
     */
    public int getSw() {
        return sw;
    }

    /**
     * Returns the critical damage inflicted by the weapon.
     * 
     * @return the critical damage of the weapon
     */
    public int getKs() {
        return ks;
    }
}
