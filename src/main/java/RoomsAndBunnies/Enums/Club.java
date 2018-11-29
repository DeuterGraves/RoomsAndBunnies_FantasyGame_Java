package RoomsAndBunnies.Enums;

public enum Club {
    MACE(50),
    AKLYS(100),
    NULLANULLA(600),
    TRUNCHEON(300);

    private final int clubValue;

    Club(int clubValue){
        this.clubValue = clubValue;
    }

    public int getClubValue(){
        return this.clubValue;
    }
}
