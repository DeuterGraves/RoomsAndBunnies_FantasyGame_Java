package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.DragonType;
import RoomsAndBunnies.Enums.WizSpellType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IRecover;

public class Wizard extends Magician implements IAttack, IDefend, IRecover {

    WizSpellType wizSpellType;
    DragonType dragonType;

    public Wizard(String name, int treasury, WizSpellType wizSpellType, DragonType dragonType){
        super(name, "Wizard", 200, treasury);
        this.wizSpellType = wizSpellType;
        this.dragonType = dragonType;
    }

    public WizSpellType getWizSpellType(){
        return this.wizSpellType;
    }

    public DragonType getDragonType(){
        return this.dragonType;
    }

    public int getDragonHealth(){
        return this.dragonType.getDragonValue();
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
