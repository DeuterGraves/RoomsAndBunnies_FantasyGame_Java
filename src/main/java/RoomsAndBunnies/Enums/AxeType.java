package RoomsAndBunnies.Enums;

public enum AxeType {
    BATTLEAXE(90),
    TOMAHAWK(80),
    DANEAXE(70);

    private final int axeValue;

    AxeType(int axeValue){
        this.axeValue = axeValue;
    }

    public int getAxeValue(){
        return this.axeValue;
    }


}
