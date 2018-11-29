package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.Dragon;
import RoomsAndBunnies.Enums.WizSpell;

public class Wizzard extends Magician {

    WizSpell wizSpell;
    Dragon dragon;

    public Wizzard(String name, String type, int healthPoints, int treasury, WizSpell wizSpell, Dragon dragon){
        super(name, type, healthPoints, treasury);
        this.wizSpell = wizSpell;
        this.dragon = dragon;
//        this.type = "Wizzard";
//        this.healthPoints = 5000;
    }

    public WizSpell getWizSpell(){
        return this.wizSpell;
    }

    public Dragon getDragon(){
        return this.dragon;
    }

    public int getDragonHealth(){
        return this.dragon.getDragonValue();
    }

    public int getWizSpellValue(){
        return this.wizSpell.getWizSpellValue();
    }
}
