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
     * Constructs a new fighter with the specified name, life points, defensive
     * power, and weapon.
     * 
     * @param nameValue   the name of the fighter
     * @param lpValue     the life points of the fighter
     * @param vwValue     the defensive power of the fighter
     * @param weaponValue the weapon of the fighter
     */
    public Fighter(String nameValue, String rasseValue, int lpValue, int vwValue, int rwValue) {
        name = nameValue;
        rasse = rasseValue;
        lp = lpValue;
        vw = vwValue;
        rw = rwValue;
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
     * Returns the rasse of the fighter.
     * 
     * @return the rasse of the fighter
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
     * Returns the defensive power of the fighter.
     * 
     * @return the defensive power of the fighter
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
     * @return the weapon of the fighter
     */
    public void setWeapon(Weapon weaponValue) {
        weapon = weaponValue;
    }

}
