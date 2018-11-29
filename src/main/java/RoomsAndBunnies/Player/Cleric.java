package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Potion;

public class Cleric extends Player {

    private enum Potion potion;
    private int treasury;

    public Cleric(String name, String type, int healthPoints, Potion potion, int treasury){
        super(name, type, healthPoints);
        this.potion = potion;
        this.treasury = treasury;
    }
}
