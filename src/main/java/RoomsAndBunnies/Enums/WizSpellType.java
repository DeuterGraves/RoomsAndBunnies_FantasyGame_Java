package RoomsAndBunnies.Enums;

public enum WizSpellType {
    LIGHTNING(70),
    FREEZE(80),
    WIND(50);

    private final int wizSpellValue;

    WizSpellType(int wizSpellValue){
        this.wizSpellValue = wizSpellValue;
    }

    public int getWizSpellValue(){
        return this.wizSpellValue;
    }
}
