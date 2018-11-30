package RoomsAndBunnies.Enums;

public enum Axe {
    BATTLEAXE(90),
    TOMAHAWK(80),
    DANEAXE(70);

    private final int axeValue;

    Axe(int axeValue){
        this.axeValue = axeValue;
    }

    public int getAxeValue(){
        return this.axeValue;
    }


}
