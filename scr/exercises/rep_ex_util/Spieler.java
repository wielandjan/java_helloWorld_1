package exercises.rep_ex_util;

/**
 * Represents a player with a name and an associated fighter.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Spieler {
    private String name;
    private Kaempfer kaempfer;

    /**
     * Constructs a new player with the specified name.
     * 
     * @param name the name of the player
     */
    public Spieler(String name) {
        this.name = name;
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
    public void setKaempfer(Kaempfer kaempfer) {
        this.kaempfer = kaempfer;
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
