package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Sword;

public class Knight extends Warrior{
    private Sword sword;

    public Knight(String name, int treasury, Sword sword){
        super(name, "Knight", 75, treasury, 100);
        this.sword = sword;
    }

    public Sword getSword() {
        return this.sword;
    }

    public int getSwordValue(){
        return this.sword.getSwordValue();
    }


}
