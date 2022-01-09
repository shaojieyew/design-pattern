package pattern.structural.bridge;


import pattern.structural.bridge.model.Car;
import pattern.structural.bridge.model.IVehicleClass;
import pattern.structural.bridge.model.Vehicle;
import pattern.structural.bridge.model.VehicleClass3;

public class Demo {

    public static void main(String args[]){

        IVehicleClass vehicleClass =  new VehicleClass3();
        Vehicle vehicle = new Car();
        vehicle.setVehicleClass(vehicleClass);

        vehicle.getVehicleClass().requirement();
        vehicle.getNumberOfSeats();
    }

}
