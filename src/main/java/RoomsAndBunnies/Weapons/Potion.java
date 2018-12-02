package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.PotionType;

public class Potion extends Weapon {


    private PotionType potionType;

    public Potion(double price, PotionType potionType){
        super(price);
        this.potionType = potionType;
    }

    public PotionType getPotionType() {
        return this.potionType;
    }

    public int getPotionValue(){
        return potionType.getPotionValue();
    }
}
