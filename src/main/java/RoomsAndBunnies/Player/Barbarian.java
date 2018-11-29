package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Club;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;

public class Barbarian extends Warrior implements IAttack {

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
}
