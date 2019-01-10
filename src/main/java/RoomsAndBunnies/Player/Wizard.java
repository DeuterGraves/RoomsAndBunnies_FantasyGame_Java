package RoomsAndBunnies.Player;

import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IEnter;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Weapons.Dragon;
import RoomsAndBunnies.Weapons.WizSpell;

public class Wizard extends Magician implements IAttack, IDefend, IRecover, IEnter {

    WizSpell wizSpell;
    Dragon dragon;

    public Wizard(String name, int treasury, WizSpell wizSpell, Dragon dragon){
        super(name, "Wizard", 200, treasury);
        this.wizSpell = wizSpell;
        this.dragon = dragon;
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


    public void attack(IDefend iDefend){
        int damage = wizSpell.getWizSpellValue();
        iDefend.defend(damage);
    }

    public void defend(int damage){
        int healthHit = damage - getDragonHealth();
        int newHealth = getHealthPoints() - healthHit;
        setHealthPoints(newHealth);
    }


    public void recover(int recoverPoints){
        this.healthPoints += recoverPoints;
    }


}
