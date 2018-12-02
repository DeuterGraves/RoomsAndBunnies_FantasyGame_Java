package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.PotionType;
import RoomsAndBunnies.Interfaces.IHeal;
import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Interfaces.ICollect;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Rooms.GoodRoom;
import RoomsAndBunnies.Rooms.Room;

public class Cleric extends Player implements IHeal, IEnter, ICollect {

    private PotionType potionType;
    private int treasury;

    public Cleric(String name, String type, int healthPoints, PotionType potionType, int treasury){
        super(name, type, healthPoints);
        this.potionType = potionType;
        this.treasury = treasury;
    }

    public PotionType getPotionType() {
        return this.potionType;
    }

    public int getTreasury() {
        return this.treasury;
    }

    public int getPotionValue(){
        return this.potionType.getPotionValue();
    }

    public void heal(IRecover iRecover){
        int recoverPoints = potionType.getPotionValue();
        iRecover.recover(recoverPoints);
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
