package RoomsAndBunnies.Player;

import RoomsAndBunnies.Weapons.Weapon;

import java.util.HashMap;

public class Merchant extends Player {

    private HashMap<Weapon, Integer> inventory;

    public Merchant(String name, String type, int healthPoints){
        super(name, "Merchant", 800);
        this.inventory = new HashMap<>();
    }

    public HashMap<Weapon, Integer> getInventory() {
        return inventory;
    }

    public void addWeaponToInventory(Weapon weapon, Integer count){
        this.inventory.put(weapon, count);
    }

    public boolean checkInventory(Weapon weapon){
        return this.inventory.containsKey(weapon);
    }

//    public int inventoryCount(){
//        return inventory.containsKey()
//    }


}
