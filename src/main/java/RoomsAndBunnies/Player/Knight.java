package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.SwordType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IRecover;

public class Knight extends Warrior implements IAttack, IDefend, IRecover {
    private SwordType swordType;

    public Knight(String name, int treasury, SwordType swordType){
        super(name, "Knight", 75, treasury, 80);
        this.swordType = swordType;
    }

    public SwordType getSwordType() {
        return this.swordType;
    }

    public int getSwordValue(){
        return this.swordType.getSwordValue();
    }


    public void attack(IDefend iDefend){
        int damage = swordType.getSwordValue();
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
