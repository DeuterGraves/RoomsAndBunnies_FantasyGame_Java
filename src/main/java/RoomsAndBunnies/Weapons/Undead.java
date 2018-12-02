package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.UndeadType;

public class Undead extends Weapon {

    private UndeadType undeadType;

    public Undead (double price, UndeadType undeadType){
        super(price);
        this.undeadType = undeadType;
    }

    public UndeadType getUndeadType(){
        return this.undeadType;
    }

    public int getUndeadValue(){
        return undeadType.getUndeadValue();
    }
}
