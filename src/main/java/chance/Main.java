package chance;

import chance.concrete.*;
import chance.interfaces.Driveable;
import chance.interfaces.Flyable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var v1 = new Car("Mustang");
        v1.setSpeed(280);
        v1.setPrice(80000.0f);

        var v2 = new Boat("Concord");
        v2.setSpeed(60);

        var v3 = new Truck("GM");
        v3.setSpeed(120);

        var v4 = new Drone();
        v4.setName("M2");
        var v5 = new FlyingCar("SeaHorse");
        v5.setSpeed(1020);
        var v6 = new Plane("717");


        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);

        vehicleList.add(v5);
        vehicleList.add(v6);

        VehicleApp.printListOfVehiclesNames(vehicleList);
        System.out.println('\n');
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(v4);
        flyables.add(v6);
        flyables.add(v5);

        VehicleApp.printListOfFlyableObjects(flyables);

        Map<Integer,String> passenger = new HashMap<>();
        passenger.put(57, "wesley snipes");
        passenger.put(007, "James Bond");
        System.out.println('\n');

        VehicleApp.printPassengerNumbersOnly(passenger);
        System.out.println('\n');

        List<Driveable> driveables = new ArrayList<>();
        driveables.add(v1);
        driveables.add(v3);
        driveables.add(v2);
        driveables.add(v5);
        VehicleApp.sortAndPrintDriveableVehiclesBySpeed(driveables);

        System.out.println('\n');

        System.out.println(v1.getPriceAfterTax());
    }
}
