package RoomsAndBunnies.Player;


public abstract class Player {

    protected String name;
    protected String type;
    protected int healthPoints;

    public Player(String name, String type, int healthPoints){
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int newHealthValue){
        this.healthPoints = newHealthValue;

    }


}
