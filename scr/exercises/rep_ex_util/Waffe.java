package exercises.rep_ex_util;

/**
 * Represents a weapon with a name and attack power.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Waffe {
    public String name;
    public int aw;

    /**
     * Constructs a new weapon with the specified name and attack power.
     * 
     * @param name the name of the weapon
     * @param aw   the attack power of the weapon
     */
    public Waffe(String nameValue, int awValue) {
        name = nameValue;
        aw = awValue;
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
     * Returns the attack power of the weapon.
     * 
     * @return the attack power of the weapon
     */
    public int getAw() {
        return aw;
    }
}
