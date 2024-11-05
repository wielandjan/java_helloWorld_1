package exercises.rep_ex_util;

/**
 * Represents a fighter with attributes such as name, life points, defensive
 * power, and a weapon.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Fighter {
    public String name;
    public int lp;
    public int vw;
    public Weapon weapon;

    /**
     * Constructs a new fighter with the specified name, life points, defensive
     * power, and weapon.
     * 
     * @param nameValue   the name of the fighter
     * @param lpValue     the life points of the fighter
     * @param vwValue     the defensive power of the fighter
     * @param weaponValue the weapon of the fighter
     */
    public Fighter(String nameValue, int lpValue, int vwValue, Weapon weaponValue) {
        name = nameValue;
        lp = lpValue;
        vw = vwValue;
        weapon = weaponValue;
    }

    /**
     * Returns the name of the fighter.
     * 
     * @return the name of the fighter
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the life points of the fighter.
     * 
     * @return the life points of the fighter
     */
    public int getLp() {
        return lp;
    }

    /**
     * Sets the life points of the fighter.
     * 
     * @param lpValue the new life points of the fighter
     */
    public void setLp(int lpValue) {
        lp = lpValue;
    }

    /**
     * Returns the defensive power of the fighter.
     * 
     * @return the defensive power of the fighter
     */
    public int getVw() {
        return vw;
    }

    /**
     * Returns the weapon of the fighter.
     * 
     * @return the weapon of the fighter
     */
    public Weapon getWaffe() {
        return weapon;
    }
}
