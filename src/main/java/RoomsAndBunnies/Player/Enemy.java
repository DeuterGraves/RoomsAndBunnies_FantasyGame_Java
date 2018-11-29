package RoomsAndBunnies.Player;

import RoomsAndBunnies.Enums.EnemyWeapon;

public class Enemy extends Player {

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


}
