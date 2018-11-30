package RoomsAndBunnies.Enums;

public enum WizSpell {
    LIGHTNING(70),
    FREEZE(80),
    WIND(50);

    private final int wizSpellValue;

    WizSpell(int wizSpellValue){
        this.wizSpellValue = wizSpellValue;
    }

    public int getWizSpellValue(){
        return this.wizSpellValue;
    }
}
