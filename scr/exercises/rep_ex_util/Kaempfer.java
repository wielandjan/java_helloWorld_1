package exercises.rep_ex_util;

/**
 * Represents a fighter with attributes such as name, life points, defensive
 * power, and a weapon.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Kaempfer {
    private String name;
    private int lp;
    private int vw;
    private Waffe waffe;

    /**
     * Constructs a new fighter with the specified name, life points, defensive
     * power, and weapon.
     * 
     * @param name  the name of the fighter
     * @param lp    the life points of the fighter
     * @param vw    the defensive power of the fighter
     * @param waffe the weapon of the fighter
     */
    public Kaempfer(String name, int lp, int vw, Waffe waffe) {
        this.name = name;
        this.lp = lp;
        this.vw = vw;
        this.waffe = waffe;
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
    public void setLp(int lp) {
        this.lp = lp;
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
