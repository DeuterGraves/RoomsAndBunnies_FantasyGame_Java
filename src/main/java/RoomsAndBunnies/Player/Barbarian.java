package RoomsAndBunnies.Player;

import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Weapons.Club;

public class Barbarian extends Warrior implements IAttack, IDefend, IRecover, IEnter {

    private Club club;

    public Barbarian(String name, int treasury, Club club){
        super(name, "Barbarian", 100, treasury, 25);
        this.club = club;
    }

    public Club getClub() {
        return this.club;
    }

    public int getClubValue(){
        return this.club.getClubValue();
    }

    public void attack(IDefend iDefend){
        int damage = club.getClubValue();
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
