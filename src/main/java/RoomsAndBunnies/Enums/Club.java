package RoomsAndBunnies.Enums;

public enum Club {
    MACE(80),
    AKLYS(70),
    NULLANULLA(90),
    TRUNCHEON(60);

    private final int clubValue;

    Club(int clubValue){
        this.clubValue = clubValue;
    }

    public int getClubValue(){
        return this.clubValue;
    }
}
