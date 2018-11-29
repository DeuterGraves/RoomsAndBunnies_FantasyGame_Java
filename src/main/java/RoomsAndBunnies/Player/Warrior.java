package RoomsAndBunnies.Player;

public abstract class Warrior extends Player {

    private int treasury;
    private int armour;

    public Warrior(String name, String type, int healthPoints, int treasury, int armour){
        super(name, type, healthPoints);
        this.treasury = treasury;
        this.armour = armour;
    }

    public int getTreasury() {
        return this.treasury;
    }

    public int getArmour() {
        return this.armour;
    }
}
