import vehicle.*;

public class VehicleManager {
    public static void operateVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.refuel();
        System.out.println();
    }

    public static void main(String[] args) {
        AbstractVehicle car = new Car("bmw", "m5", 30);
        AbstractVehicle motorcycle = new Motorcycle("harley davidson", "low rider", 0);
        AbstractVehicle truck = new Truck("scania", "s", 100);

        operateVehicle(car);
        operateVehicle(motorcycle);
        operateVehicle(truck);
    }
}
