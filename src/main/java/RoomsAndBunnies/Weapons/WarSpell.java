package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.WarSpellType;

public class WarSpell extends Weapon{

    private WarSpellType warSpellType;

    public WarSpell (double price, WarSpellType warSpellType){
        super(price);
        this.warSpellType = warSpellType;
    }

    public WarSpellType getWarSpellType(){
        return this.warSpellType;
    }

    public int getWarSpellValue(){
        return warSpellType.getWarSpellValue();
    }
}
