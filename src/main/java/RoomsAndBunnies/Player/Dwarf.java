package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Axe;
import RoomsAndBunnies.Interfaces.IDefend;

public class Dwarf extends Warrior implements IDefend {

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

    public void defend(int damage){
        int healthHit = damage - getArmour();
        int newHealth = getHealthPoints() - healthHit;
        setHealthPoints(newHealth);
    }

}
