package chance;

import chance.interfaces.Driveable;
import chance.interfaces.Flyable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class VehicleApp {
    public static void printListOfVehiclesNames(List<Vehicle> vehicleList){
        for (Vehicle vehicle: vehicleList){
            System.out.println(vehicle.getName());
        }
    }

    public static void printListOfFlyableObjects(List<Flyable> flyables){
        for(Flyable flyable: flyables){
            System.out.println(flyable.toString());
        }
    }

    public static void sortAndPrintDriveableVehiclesBySpeed(List<Driveable> driveables){


            Collections.sort(driveables, new Comparator<Driveable>() {
                @Override
                public int compare(Driveable o1, Driveable o2) {
                    var v1 = (Vehicle) o1;
                    var v2 = (Vehicle) o2;

                    if(v1.getSpeed() < v2.getSpeed()){
                        return -1;
                    } else if(v1.getSpeed() >v2.getSpeed()){
                    }
                    return 0;
                }
            });

        System.out.println(driveables);

    }

    public static void printPassengerNumbersOnly(Map<Integer, String> passengers){
        for (Integer entry: passengers.keySet()) {
            System.out.println(entry);
        }
    }
}
