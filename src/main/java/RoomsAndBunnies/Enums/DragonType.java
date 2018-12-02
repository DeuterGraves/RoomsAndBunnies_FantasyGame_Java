package RoomsAndBunnies.Enums;

public enum DragonType {
    BLUE(100),
    PURPLE(75),
    GREY(20);

    private final int dragonValue;

    DragonType(int dragonValue){
        this.dragonValue = dragonValue;
    }

    public int getDragonValue(){
        return this.dragonValue;
    }
}
