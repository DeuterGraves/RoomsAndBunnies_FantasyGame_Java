package RoomsAndBunnies.Enums;

public enum WarSpellType {
    FIREBALL(7000),
    EVILCURSE(10),
    TORNADO(200);

    private final int warSpellValue;

    WarSpellType(int warSpellValue){
        this.warSpellValue = warSpellValue;
    }

    public int getWarSpellValue() {
        return this.warSpellValue;
    }
}
