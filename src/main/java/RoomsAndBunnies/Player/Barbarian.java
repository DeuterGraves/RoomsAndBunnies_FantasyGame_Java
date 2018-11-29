package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Club;

public class Barbarian extends Warrior {

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
}
