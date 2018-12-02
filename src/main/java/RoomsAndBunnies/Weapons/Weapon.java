package RoomsAndBunnies.Weapons;

public abstract class Weapon {

    protected double price;

    public Weapon(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

}
