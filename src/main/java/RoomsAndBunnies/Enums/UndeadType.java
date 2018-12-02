package RoomsAndBunnies.Enums;

public enum UndeadType {
    SKELETON(-50),
    ZOMBIE(-75),
    GOUL(-20);

    private final int undeadValue;

    UndeadType(int undeadValue){
        this.undeadValue = undeadValue;
    }

    public int getUndeadValue() {
        return this.undeadValue;
    }
}
