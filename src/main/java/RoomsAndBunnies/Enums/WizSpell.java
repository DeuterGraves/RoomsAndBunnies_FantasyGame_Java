package RoomsAndBunnies.Enums;

public enum WizSpell {
    LIGHTNING(5000),
    FREEZE(2000),
    WIND(500);

    private final int wizSpellValue;

    WizSpell(int wizSpellValue){
        this.wizSpellValue = wizSpellValue;
    }

    public int getWizSpellValue(){
        return this.wizSpellValue;
    }
}
