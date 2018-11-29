package RoomsAndBunnies.Enums;

public enum WarSpell {
    FIREBALL(7000),
    EVILCURSE(10),
    TORNADO(200);

    private final int warSpellValue;

    WarSpell(int warSpellValue){
        this.warSpellValue = warSpellValue;
    }

    public int getWarSpellValue() {
        return this.warSpellValue;
    }
}
