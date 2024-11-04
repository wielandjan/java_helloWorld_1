package exercises.rep_ex_util;

/**
 * Represents a weapon with a name and attack power.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Waffe {
    private String name;
    private int aw;

    /**
     * Constructs a new weapon with the specified name and attack power.
     * 
     * @param name the name of the weapon
     * @param aw   the attack power of the weapon
     */
    public Waffe(String name, int aw) {
        this.name = name;
        this.aw = aw;
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
