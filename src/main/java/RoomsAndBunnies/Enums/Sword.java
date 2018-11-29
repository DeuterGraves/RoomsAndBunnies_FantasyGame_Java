package RoomsAndBunnies.Enums;

public enum Sword {
    LONGSWORD(800),
    DAGGER(50),
    KNIGHTLYSWORD(400),
    SCIMITAR(200);

    private final int swordValue;

    Sword(int swordValue){
        this.swordValue = swordValue;
    }

    public int getSwordValue(){
        return this.swordValue;
    }

}
