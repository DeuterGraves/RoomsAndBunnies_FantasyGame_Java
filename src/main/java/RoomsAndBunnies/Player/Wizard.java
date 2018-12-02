package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.WizSpellType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Weapons.Dragon;

public class Wizard extends Magician implements IAttack, IDefend, IRecover {

    WizSpellType wizSpellType;
    Dragon dragon;

    public Wizard(String name, int treasury, WizSpellType wizSpellType, Dragon dragon){
        super(name, "Wizard", 200, treasury);
        this.wizSpellType = wizSpellType;
        this.dragon = dragon;
    }

    public WizSpellType getWizSpellType(){
        return this.wizSpellType;
    }

    public Dragon getDragon(){
        return this.dragon;
    }

    public int getDragonHealth(){
        return this.dragon.getDragonValue();
    }

    public int getWizSpellValue(){
        return this.wizSpellType.getWizSpellValue();
    }


    public void attack(IDefend iDefend){
        int damage = wizSpellType.getWizSpellValue();
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
