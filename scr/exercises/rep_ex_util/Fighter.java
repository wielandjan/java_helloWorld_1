package exercises.rep_ex_util;

/**
 * Represents a fighter with attributes such as name, life points, defensive
 * power, and a weapon.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Fighter {
    private String name;
    private String rasse;
    private int lp;
    private int vw;
    private int rw;
    private Weapon weapon;

    /**
     * Constructs a new fighter with the specified name, race, life points,
     * defensive power, and weapon reach.
     * 
     * @param name  the name of the fighter
     * @param rasse the race of the fighter
     * @param lp    the life points of the fighter
     * @param vw    the defensive power of the fighter
     * @param rw    the weapon reach of the fighter
     */
    public Fighter(String name, String rasse, int lp, int vw, int rw) {
        this.name = name;
        this.rasse = rasse;
        this.lp = lp;
        this.vw = vw;
        this.rw = rw;
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
     * Returns the race of the fighter.
     * 
     * @return the race of the fighter
     */
    public String getRace() {
        return rasse;
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
     * Returns the weapon reach of the fighter.
     * 
     * @return the weapon reach of the fighter
     */
    public int getRw() {
        return rw;
    }

    /**
     * Returns the weapon of the fighter.
     * 
     * @return the weapon of the fighter
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Sets the weapon of the fighter.
     * 
     * @param weapon the new weapon for the fighter
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
