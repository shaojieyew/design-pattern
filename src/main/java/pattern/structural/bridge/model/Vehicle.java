package pattern.structural.bridge.model;

public abstract class Vehicle {

    private IVehicleClass vehicleClass;

    public abstract int getNumberOfSeats();


    public IVehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(IVehicleClass vehicleClass) {
        this.vehicleClass = vehicleClass;
    }
}
