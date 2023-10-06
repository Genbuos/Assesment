package chance.concrete;

import chance.interfaces.Flyable;

public class Drone implements Flyable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean transportPassengers() {
        return false;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "name='" + name + '\'' +
                ", transportPassengers=" + transportPassengers() +
                '}';
    }
}
