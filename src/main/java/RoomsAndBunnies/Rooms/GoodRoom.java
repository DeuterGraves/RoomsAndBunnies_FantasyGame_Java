package RoomsAndBunnies.Rooms;

public class GoodRoom extends Room {

    private int treasure;

    public GoodRoom(String name, int treasure){
        super(name);
        this.treasure = treasure;
    }

    public int getTreasure(){
        return this.treasure;
    }

    public void setTreasure(int newTreasure){
        this.treasure = newTreasure;
    }
}
