package exercises.rep_ex_util;

/**
 * Represents a player with a name and an associated fighter.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Spieler {
    public String name;
    public Kaempfer kaempfer;

    /**
     * Constructs a new player with the specified name.
     * 
     * @param name the name of the player
     */
    public Spieler(String nameValue) {
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
     * @param kaempfer the fighter to associate with the player
     */
    public void setKaempfer(Kaempfer kaempferValue) {
        kaempfer = kaempferValue;
    }

    /**
     * Returns the fighter associated with the player.
     * 
     * @return the fighter associated with the player
     */
    public Kaempfer getKaempfer() {
        return kaempfer;
    }
}
