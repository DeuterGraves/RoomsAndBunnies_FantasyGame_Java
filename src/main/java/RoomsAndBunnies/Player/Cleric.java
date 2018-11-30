package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Potion;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IHeal;
import RoomsAndBunnies.Interfaces.IRecover;

public class Cleric extends Player implements IHeal {

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
}
