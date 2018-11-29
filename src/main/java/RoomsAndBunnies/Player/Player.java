package RoomsAndBunnies.Player;


public abstract class Player {

    protected String name;
    protected String type;
    protected int healthpoints;

    public Player(String name, String type, int healthpoints){
        this.name = name;
        this.type = type;
        this.healthpoints = healthpoints;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthpoints(){
        return this.healthpoints;
    }


}
