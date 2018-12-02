package RoomsAndBunnies.Weapons;

import RoomsAndBunnies.Enums.EnemyWeaponType;

public class EnemyWeapon extends Weapon {

    private EnemyWeaponType enemyWeaponType;

    public EnemyWeapon(double price, EnemyWeaponType enemyWeaponType){
        super(price);
        this.enemyWeaponType = enemyWeaponType;
    }

    public EnemyWeaponType getEnemyWeaponType(){
        return this.enemyWeaponType;
    }

    public int getEnemyWeaponValue(){
        return enemyWeaponType.getWeaponValue();
    }

}
