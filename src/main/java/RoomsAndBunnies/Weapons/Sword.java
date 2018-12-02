package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.SwordType;

public class Sword extends Weapon {

    private SwordType swordType;

    public Sword(double price, SwordType swordType){
        super(price);
        this.swordType = swordType;
    }

    public SwordType getSwordType(){
        return this.swordType;
    }

    public int getSwordValue(){
        return swordType.getSwordValue();
    }

}
