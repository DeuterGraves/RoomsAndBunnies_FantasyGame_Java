package RoomsAndBunnies.Enums;

public enum Undead {
    SKELETON(-50),
    ZOMBIE(-75),
    GOUL(-20);

    private final int undeadValue;

    Undead(int undeadValue){
        this.undeadValue = undeadValue;
    }

    public int getUndeadValue() {
        return this.undeadValue;
    }
}
