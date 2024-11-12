package exercises.rep_ex_util;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player with a name and an associated list of fighters.
 * Each player can have multiple fighters assigned.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class Player {
    private String name;
    private List<Fighter> fighters = new ArrayList<>();

    /**
     * Constructs a new player with the specified name.
     * 
     * @param name the name of the player
     */
    public Player(String name) {
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
     * Adds a fighter to the player's list of fighters.
     * 
     * @param fighter the fighter to associate with the player
     */
    public void setFighter(Fighter fighter) {
        fighters.add(fighter); // Add the specified fighter to the player's list
    }

    /**
     * Removes a fighter from the player's list of fighters.
     * 
     * @param fighter the fighter to remove from the player
     */
    public void removeFighter(Fighter fighter) {
        fighters.remove(fighter); // Remove the specified fighter from the list
    }

    /**
     * Returns the list of fighters associated with the player.
     * 
     * @return the list of fighters associated with the player
     */
    public List<Fighter> getFighters() {
        return fighters;
    }
}
