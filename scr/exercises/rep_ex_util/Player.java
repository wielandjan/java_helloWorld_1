package exercises.rep_ex_util;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player with a name and an associated fighter.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Player {
    private String name;
    private List<Fighter> fighters = new ArrayList<>();
    private Fighter fighter1;
    private Fighter fighter2;
    private Fighter fighter3;

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
        fighters.add(fighterValue);
    }

    /**
     * Remove the fighter associated with the player.
     * 
     * @param fighterValue the fighter to associate with the player
     */
    public void removeFighter(Fighter fighterValue) {
        fighters.remove(fighterValue);
    }

    /**
     * Returns the fighter associated with the player.
     * 
     * @return the fighter associated with the player
     */
    public List<Fighter> getFighters() {
        return fighters;
    }
}
