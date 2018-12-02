package RoomsAndBunnies.Enums;

public enum EnemyWeaponType {
    LASSO(90),
    HUGEHAMMER(90),
    GUILLOTINE(100);

    private final int weaponValue;

    EnemyWeaponType(int weaponValue){
        this.weaponValue = weaponValue;
    }

    public int getWeaponValue(){
        return this.weaponValue;
    }
}
