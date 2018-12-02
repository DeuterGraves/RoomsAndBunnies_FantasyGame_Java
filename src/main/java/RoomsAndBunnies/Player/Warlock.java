package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.UndeadType;
import RoomsAndBunnies.Enums.WarSpellType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;
import RoomsAndBunnies.Interfaces.IRecover;

public class Warlock extends Magician implements IAttack, IDefend, IRecover {

    UndeadType undeadType;
    WarSpellType warSpellType;

    public Warlock(String name, int treasury, UndeadType undeadType, WarSpellType warSpellType){
        super(name, "Warlock", 100, treasury);
        this.undeadType = undeadType;
        this.warSpellType = warSpellType;
    }

    public UndeadType getUndeadType() {
        return this.undeadType;
    }

    public WarSpellType getWarSpellType(){
        return this.warSpellType;
    }

    public int getWarSpellValue(){
        return this.warSpellType.getWarSpellValue();
    }

    public int getUndeadValue(){
        return this.undeadType.getUndeadValue();
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




