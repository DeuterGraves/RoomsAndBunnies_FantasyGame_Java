package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Axe;

public class Dwarf extends Warrior {

    private Axe axe;

    public Dwarf(String name, int treasury, Axe axe){
        super(name, "Dwarf", 75, treasury, 50);
        this.axe = axe;
    }

    public Axe getAxe() {
        return this.axe;
    }

    public int getAxeValue(){
        return this.axe.getAxeValue();
    }

}
