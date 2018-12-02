package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.WarSpellType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IRecover;
import RoomsAndBunnies.Weapons.Undead;

public class Warlock extends Magician implements IAttack, IDefend, IRecover {

    Undead undead;
    WarSpellType warSpellType;

    public Warlock(String name, int treasury, Undead undead, WarSpellType warSpellType){
        super(name, "Warlock", 100, treasury);
        this.undead = undead;
        this.warSpellType = warSpellType;
    }

    public Undead getUndead() {
        return this.undead;
    }

    public WarSpellType getWarSpellType(){
        return this.warSpellType;
    }

    public int getWarSpellValue(){
        return this.warSpellType.getWarSpellValue();
    }

    public int getUndeadValue(){
        return this.undead.getUndeadValue();
    }


    public void attack(IDefend iDefend){
        int damage = warSpellType.getWarSpellValue();
        iDefend.defend(damage);
    }

    public void defend(int damage){
        int healthHit = damage - getUndeadValue();
        int newHealth = getHealthPoints() - healthHit;
        setHealthPoints(newHealth);
    }

    public void recover(int recoverPoints){
        this.healthPoints += recoverPoints;
    }

}




