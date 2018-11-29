package RoomsAndBunnies.Enums;

public enum Axe {
    BATTLEAXE(300),
    TOMAHAWK(150),
    DANEAXE(400);

    private final int axeValue;

    Axe(int axeValue){
        this.axeValue = axeValue;
    }

    public int getAxeValue(){
        return this.axeValue;
    }


}
