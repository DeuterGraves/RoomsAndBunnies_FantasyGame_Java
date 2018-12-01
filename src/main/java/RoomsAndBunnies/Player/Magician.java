package RoomsAndBunnies.Player;

import RoomsAndBunnies.Interfaces.ICollect;
import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Rooms.GoodRoom;
import RoomsAndBunnies.Rooms.Room;

public abstract class Magician extends Player implements IEnter, ICollect {

    private int treasury;

    public Magician(String name, String type, int healthPoints, int treasury) {
        super(name, type, healthPoints);
        this.treasury = treasury;
    }

    public int getTreasury() {
        return this.treasury;
    }

    public void enterRoom(Room room) {
        room.setPlayer(this);
    }


    public void collectTreasure(GoodRoom goodRoom){
        int treasureValue = goodRoom.getTreasure();
        this.treasury += treasureValue;
        goodRoom.setTreasure(0);
    }

}
