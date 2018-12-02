package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.WizSpellType;

public class WizSpell extends Weapon {

    private WizSpellType wizSpellType;

    public WizSpell (double price, WizSpellType wizSpellType){
        super(price);
        this.wizSpellType = wizSpellType;
    }

    public WizSpellType getWizSpellType(){
        return this.wizSpellType;
    }

    public int getWizSpellValue(){
        return wizSpellType.getWizSpellValue();
    }
}
