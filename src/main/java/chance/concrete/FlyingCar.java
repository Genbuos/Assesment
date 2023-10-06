package chance.concrete;

import chance.Engine;
import chance.Vehicle;
import chance.interfaces.Driveable;
import chance.interfaces.Flyable;

public class FlyingCar extends Vehicle implements Flyable, Driveable {
    public FlyingCar(String name) {
        super(name);
    }

    public FlyingCar(int speed, double price, Engine engine) {
        super(speed, price, engine);
    }

    @Override
    public void printSpeed() {
        System.out.println(this.getSpeed());
    }

    @Override
    public boolean transportPassengers() {
        return true;
    }

    @Override
    public String toString() {
        return "FlyingCar{" +
                "TAX_AMT=" + TAX_AMT +
                ", transportPassengers=" + transportPassengers() +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", TAX_AMT=" + getTAX_AMT() +
                '}';
    }
}
