package RoomsAndBunnies.Player;


import RoomsAndBunnies.Interfaces.IHeal;
import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Interfaces.ICollect;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Rooms.GoodRoom;
import RoomsAndBunnies.Rooms.Room;
import RoomsAndBunnies.Weapons.Potion;

public class Cleric extends Player implements IHeal, IEnter, ICollect {

    private Potion potion;
    private int treasury;

    public Cleric(String name, String type, int healthPoints, Potion potion, int treasury){
        super(name, type, healthPoints);
        this.potion = potion;
        this.treasury = treasury;
    }

    public Potion getPotion() {
        return this.potion;
    }

    public int getTreasury() {
        return this.treasury;
    }

    public int getPotionValue(){
        return this.potion.getPotionValue();
    }

    public void heal(IRecover iRecover){
        int recoverPoints = potion.getPotionValue();
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
