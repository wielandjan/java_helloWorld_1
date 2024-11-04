package exercises.rep_ex_util;

/**
 * Represents a fighter with attributes such as name, life points, defensive
 * power, and a weapon.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Kaempfer {
    public String name;
    public int lp;
    public int vw;
    public Waffe waffe;

    /**
     * Constructs a new fighter with the specified name, life points, defensive
     * power, and weapon.
     */
    public Kaempfer(String nameValue, int lpValue, int vwValue, Waffe waffeValue) {
        name = nameValue;
        lp = lpValue;
        vw = vwValue;
        waffe = waffeValue;
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
     * @param lp the new life points of the fighter
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
    public Waffe getWaffe() {
        return waffe;
    }
}
