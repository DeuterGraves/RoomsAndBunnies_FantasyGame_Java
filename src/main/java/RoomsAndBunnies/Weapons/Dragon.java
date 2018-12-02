package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.DragonType;

public class Dragon extends Weapon {

    private DragonType dragonType;

    public Dragon(double price, DragonType dragonType){
        super(price);
        this.dragonType = dragonType;
    }

    public DragonType getDragonType(){
        return this.dragonType;
    }

    public int getDragonValue(){
        return dragonType.getDragonValue();
    }

}
