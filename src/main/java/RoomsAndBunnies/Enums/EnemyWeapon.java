package RoomsAndBunnies.Enums;

public enum EnemyWeapon {
    LASSO(30),
    HUGEHAMMER(50),
    GUILLOTINE(1000);

    private final int weaponValue;

    EnemyWeapon(int weaponValue){
        this.weaponValue = weaponValue;
    }

    public int getWeaponValue(){
        return this.weaponValue;
    }
}
