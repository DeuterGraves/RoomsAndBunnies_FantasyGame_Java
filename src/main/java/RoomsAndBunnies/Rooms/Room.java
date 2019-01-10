package RoomsAndBunnies.Rooms;

import RoomsAndBunnies.Interfaces.IEnter;

import java.util.ArrayList;
import java.util.List;

public abstract class Room {

    protected String name;
    protected List<IEnter> players;

    public Room(String name){
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }


    public List<IEnter> getPlayers() {
        return players;
    }

    public void addPlayer(IEnter iEnter){
        this.players.add(iEnter);
    }

    public int countPlayers(){
        return this.players.size();
    }

}

