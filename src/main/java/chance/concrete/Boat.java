package chance.concrete;

import chance.Engine;
import chance.Vehicle;
import chance.interfaces.Driveable;

public class Boat extends Vehicle implements Driveable {
    private boolean hasGps;

    public boolean isHasGps() {
        return hasGps;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public Boat(String name) {
        super(name);
    }

    public Boat(int speed, double price, Engine engine) {
        super(speed, price, engine);
    }

    public void printGpsInfo(){
        if(hasGps == true){
            System.out.println("Gps info");
        }else{
            System.out.println("hasGps boolean has not been init");
        }
    }

    @Override
    public void printSpeed() {
        System.out.println(this.getSpeed());
    }

    @Override
    public String toString() {
        return "Boat{" +
                "hasGps=" + hasGps +
                ", TAX_AMT=" + TAX_AMT +
                ", speed=" + getSpeed() +
                ", price=" + getPrice() +
                ", engine=" + getEngine() +
                ", TAX_AMT=" + getTAX_AMT() +
                '}';
    }
}
