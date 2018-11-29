package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.EnemyWeapon;
import RoomsAndBunnies.Interfaces.IAttack;
import RoomsAndBunnies.Interfaces.IDefend;

public class Enemy extends Player implements IAttack, IDefend {

    private EnemyWeapon enemyWeapon;

    public Enemy(String name, String type, int healthPoints, EnemyWeapon enemyWeapon){
        super(name, type, healthPoints);
        this.enemyWeapon = enemyWeapon;
    }

    public EnemyWeapon getEnemyWeapon() {
        return this.enemyWeapon;
    }

    public int getEnemyWeaponValue(){
        return this.enemyWeapon.getWeaponValue();
    }

    public void attack(IDefend iDefend){
        int damage = enemyWeapon.getWeaponValue();
        iDefend.defend(damage);

    }

    public void defend(int damage){
        int newHealth = getHealthPoints() - damage;
        setHealthPoints(newHealth);
    }


}
