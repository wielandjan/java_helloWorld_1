package exercises.rep_ex_util;

/**
 * Represents a weapon with a name and attack power.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Weapon {
    private String name;
    private String race;
    private WeaponTyp typ;
    private int aw;
    private int BF_KG;
    private int sw;
    private int ks;

    /**
     * Constructs a new weapon with the specified name and attack power.
     * 
     * @param nameValue the name of the weapon
     * @param awValue   the attack power of the weapon
     */
    public Weapon(String nameValue, String raceValue, WeaponTyp typValue, int awValue, int BF_KGValue, int swValue,
            int ksValue) {
        name = nameValue;
        race = raceValue;
        typ = typValue;
        aw = awValue;
        BF_KG = BF_KGValue;
        sw = swValue;
        ks = ksValue;

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
     * Returns the race of the weapon.
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
     * Returns the attack value of the weapon.
     * 
     * @return the attack value of the weapon
     */
    public int getAw() {
        return aw;
    }

    /**
     * Returns the ballistic skill or combat skill of the weapon.
     * 
     * @return the ballistic skill or combat skill of the weapon
     */
    public int getBF_KG() {
        return BF_KG;
    }

    /**
     * Returns the standard damage value of the weapon.
     * 
     * @return the standard damage value of the weapon
     */
    public int getSw() {
        return sw;
    }

    /**
     * Returns the critical damage value of the weapon.
     * 
     * @return the critical damage value of the weapon
     */
    public int getKs() {
        return ks;
    }

}
