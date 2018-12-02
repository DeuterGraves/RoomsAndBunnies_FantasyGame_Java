package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.AxeType;

public class Axe extends Weapon{

    private AxeType axeType;

    public Axe(double price, AxeType axeType){
        super(price);
        this.axeType = axeType;
    }

    public AxeType getAxeType() {
        return this.axeType;
    }

    public int getAxeValue(){
       return axeType.getAxeValue();
    }
}
