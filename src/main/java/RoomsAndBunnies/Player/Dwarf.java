package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.AxeType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Weapons.Axe;

public class Dwarf extends Warrior implements IDefend, IAttack, IRecover, IEnter {

//    private AxeType axeType;
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

    public void attack(IDefend iDefend){
        int damage = axe.getAxeValue();
        iDefend.defend(damage);

    }

    public void defend(int damage){
        int healthHit = damage - getArmour();
        int newHealth = getHealthPoints() - healthHit;
        setHealthPoints(newHealth);
    }

    public void recover(int recoverPoints){
        this.healthPoints += recoverPoints;
    }

}
