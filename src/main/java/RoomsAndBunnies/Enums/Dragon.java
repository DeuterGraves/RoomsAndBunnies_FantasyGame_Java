package RoomsAndBunnies.Enums;

public enum Dragon {
    BLUE(100),
    PURPLE(75),
    GREY(20);

    private final int dragonValue;

    Dragon (int dragonValue){
        this.dragonValue = dragonValue;
    }

    public int getDragonValue(){
        return this.dragonValue;
    }
}
