package RoomsAndBunnies.Enums;

public enum EnemyWeapon {
    LASSO(90),
    HUGEHAMMER(90),
    GUILLOTINE(100);

    private final int weaponValue;

    EnemyWeapon(int weaponValue){
        this.weaponValue = weaponValue;
    }

    public int getWeaponValue(){
        return this.weaponValue;
    }
}
