package RoomsAndBunnies.Player;

import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Rooms.Room;

public abstract class Warrior extends Player implements IEnter {

    protected int treasury;
    protected int armour;

    public Warrior(String name, String type, int healthPoints, int treasury, int armour){
        super(name, type, healthPoints);
        this.treasury = treasury;
        this.armour = armour;
    }

    public int getTreasury() {
        return this.treasury;
    }

    public int getArmour() {
        return this.armour;
    }

    public void enterRoom(Room room){
        room.setPlayer(this);
    }
}
