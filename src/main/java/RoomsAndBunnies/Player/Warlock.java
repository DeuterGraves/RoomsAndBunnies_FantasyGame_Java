package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Undead;
import RoomsAndBunnies.Enums.WarSpell;

public class Warlock extends Magician {

    Undead undead;
    WarSpell warSpell;

    public Warlock(String name, int treasury, Undead undead, WarSpell warSpell){
        super(name, "Warlock", 100, treasury);
        this.undead = undead;
        this.warSpell = warSpell;
    }

    public Undead getUndead() {
        return this.undead;
    }

    public WarSpell getWarSpell(){
        return this.warSpell;
    }

    public int getWarSpellValue(){
        return this.warSpell.getWarSpellValue();
    }

    public int getUndeadValue(){
        return this.undead.getUndeadValue();
    }
}
