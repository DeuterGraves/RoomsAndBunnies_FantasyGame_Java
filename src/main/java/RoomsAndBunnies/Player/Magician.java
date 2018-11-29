package RoomsAndBunnies.Player;

public abstract class Magician extends Player {

    private int treasury;

    public Magician(String name, String type, int healthPoints, int treasury){
        super(name, type, healthPoints);
        this.treasury = treasury;
    }

    public int getTreasury(){
        return this.treasury;
    }

}
