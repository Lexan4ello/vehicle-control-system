package vehicle;

public class Truck extends AbstractVehicle {
    public Truck(String brand, String model, int fuelLevel) {
        super(brand, model, fuelLevel);
    }

    @Override
    public void start() {
        System.out.println("The truck is started to move");
    }

    @Override
    public void stop() {
        System.out.println("The truck is stopped");
    }

    @Override
    public void refuel() {
        fuelUp(MAX_FUEL_LEVEL - getFuelLevel());
    }

    public void loadCargo(int weight) {
        System.out.println(weight + "kg loaded");
    }
}
