package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.AxeType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IRecover;

public class Dwarf extends Warrior implements IDefend, IAttack, IRecover {

    private AxeType axeType;

    public Dwarf(String name, int treasury, AxeType axeType){
        super(name, "Dwarf", 75, treasury, 50);
        this.axeType = axeType;
    }

    public AxeType getAxeType() {
        return this.axeType;
    }

    public int getAxeValue(){
        return this.axeType.getAxeValue();
    }

    public void attack(IDefend iDefend){
        int damage = axeType.getAxeValue();
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
