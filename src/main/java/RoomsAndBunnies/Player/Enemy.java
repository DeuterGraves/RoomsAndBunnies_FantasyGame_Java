package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.EnemyWeaponType;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;

public class Enemy extends Player implements IAttack, IDefend {

    private EnemyWeaponType enemyWeaponType;

    public Enemy(String name, String type, int healthPoints, EnemyWeaponType enemyWeaponType){
        super(name, type, healthPoints);
        this.enemyWeaponType = enemyWeaponType;
    }

    public EnemyWeaponType getEnemyWeaponType() {
        return this.enemyWeaponType;
    }

    public int getEnemyWeaponValue(){
        return this.enemyWeaponType.getWeaponValue();
    }

    public void attack(IDefend iDefend){
        int damage = enemyWeaponType.getWeaponValue();
        iDefend.defend(damage);

    }

    public void defend(int damage){
        int newHealth = getHealthPoints() - damage;
        setHealthPoints(newHealth);
    }


}
