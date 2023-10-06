package chance.concrete;

import chance.Engine;
import chance.Vehicle;
import chance.interfaces.Flyable;

public class Plane extends Vehicle implements Flyable {
    public Plane(String name) {
        super(name);
    }

    public Plane(int speed, double price, Engine engine) {
        super(speed, price, engine);
    }

    @Override
    public boolean transportPassengers() {
        return true;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "TAX_AMT=" + TAX_AMT +
                ", transportPassengers=" + transportPassengers() +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", TAX_AMT=" + getTAX_AMT() +
                '}';
    }
}
