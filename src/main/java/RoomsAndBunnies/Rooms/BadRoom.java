package RoomsAndBunnies.Rooms;

import RoomsAndBunnies.Player.Enemy;

public class BadRoom extends Room {

    private Enemy enemy;

    public BadRoom(String name, Enemy enemy){
        super(name);
        this.enemy = enemy;
    }

    public Enemy getEnemy(){
        return this.enemy;
    }
}
