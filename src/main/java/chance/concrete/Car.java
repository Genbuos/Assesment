package chance.concrete;

import chance.Engine;
import chance.Vehicle;
import chance.interfaces.Driveable;

public class Car extends Vehicle implements Driveable {

    private int numberOfDoors;
    private float extraTax = .05f;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String name) {
        super(name);
    }

    public Car(int speed, double price, Engine engine) {
        super(speed, price, engine);
    }

    public void printNumberOfDoors(){
        System.out.println(getNumberOfDoors());
    }

    @Override
    public void printSpeed() {
        System.out.println(this.getSpeed());
    }

    @Override
    public float getPriceAfterTax() {
            float xtra = this.extraTax + TAX_AMT;
            float amount = getPrice() * xtra;
            float total = getPrice() + amount;

            return total;

    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", extraTax=" + extraTax +
                ", TAX_AMT=" + TAX_AMT +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", TAX_AMT=" + getTAX_AMT() +
                '}';
    }
}
