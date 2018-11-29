package RoomsAndBunnies.Rooms;

import RoomsAndBunnies.Player.Player;

public abstract class Room {

    String name;
    Player player;

    public Room(String name){
        this.name = name;
        this.player = null;
    }

    public String getName(){
        return this.name;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer(){
        return this.player;
    }

}
