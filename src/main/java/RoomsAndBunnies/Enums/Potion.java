package RoomsAndBunnies.Enums;

public enum Potion {
    POTION1(20),
    POTION2(10),
    POTION3(30);

    private final int potionValue;

    Potion(int potionValue){
        this.potionValue = potionValue;
    }

    public int getPotionValue(){
        return this.potionValue;
    }
}
