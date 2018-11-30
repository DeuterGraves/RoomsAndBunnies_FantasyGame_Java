package RoomsAndBunnies.Enums;

public enum Sword {
    LONGSWORD(80),
    DAGGER(50),
    KNIGHTLYSWORD(60),
    SCIMITAR(70);

    private final int swordValue;

    Sword(int swordValue){
        this.swordValue = swordValue;
    }

    public int getSwordValue(){
        return this.swordValue;
    }

}
