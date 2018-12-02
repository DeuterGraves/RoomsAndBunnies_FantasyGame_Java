package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.ClubType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IRecover;

public class Barbarian extends Warrior implements IAttack, IDefend, IRecover {

    private ClubType clubType;

    public Barbarian(String name, int treasury, ClubType clubType){
        super(name, "Barbarian", 100, treasury, 25);
        this.clubType = clubType;
    }

    public ClubType getClubType() {
        return this.clubType;
    }

    public int getClubValue(){
        return this.clubType.getClubValue();
    }

    public void attack(IDefend iDefend){
        int damage = clubType.getClubValue();
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
