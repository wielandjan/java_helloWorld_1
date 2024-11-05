package exercises.rep_ex_util;

/**
 * Represents a player with a name and an associated fighter.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Player {
    public String name;
    public Fighter fighter;

    /**
     * Constructs a new player with the specified name.
     * 
     * @param nameValue the name of the player
     */
    public Player(String nameValue) {
        name = nameValue;
    }

    /**
     * Returns the name of the player.
     * 
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the fighter associated with the player.
     * 
     * @param fighterValue the fighter to associate with the player
     */
    public void setFighter(Fighter fighterValue) {
        fighter = fighterValue;
    }

    /**
     * Returns the fighter associated with the player.
     * 
     * @return the fighter associated with the player
     */
    public Fighter getFighter() {
        return fighter;
    }
}
