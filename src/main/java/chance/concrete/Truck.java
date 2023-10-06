package chance.concrete;

import chance.Engine;
import chance.Vehicle;
import chance.interfaces.Driveable;

public class Truck extends Vehicle implements Driveable {
    public Truck(String name) {
        super(name);
    }

    public Truck(int speed, double price, Engine engine) {
        super(speed, price, engine);
    }
    @Override
    public void printSpeed() {
        System.out.println(this.getSpeed());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "TAX_AMT=" + TAX_AMT +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", TAX_AMT=" + getTAX_AMT() +
                '}';
    }
}
