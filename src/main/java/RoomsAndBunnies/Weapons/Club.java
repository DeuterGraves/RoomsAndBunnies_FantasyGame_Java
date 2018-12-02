package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.ClubType;

public class Club extends Weapon {

    private ClubType clubType;

    public Club (double price, ClubType clubType){
        super(price);
        this.clubType = clubType;
    }

    public ClubType getClubType(){
        return this.clubType;
    }

    public int getClubValue(){
        return clubType.getClubValue();
    }
}
