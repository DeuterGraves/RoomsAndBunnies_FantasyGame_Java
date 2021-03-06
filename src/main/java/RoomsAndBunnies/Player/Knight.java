package RoomsAndBunnies.Player;

import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Weapons.Sword;

public class Knight extends Warrior implements IAttack, IDefend, IRecover, IEnter {
    private Sword sword;

    public Knight(String name, int treasury, Sword sword){
        super(name, "Knight", 75, treasury, 80);
        this.sword = sword;
    }

    public Sword getSwordType() {
        return this.sword;
    }

    public int getSwordValue(){
        return this.sword.getSwordValue();
    }

    public void attack(IDefend iDefend){
        int damage = sword.getSwordValue();
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
