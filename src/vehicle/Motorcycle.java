package vehicle;

public class Motorcycle extends AbstractVehicle {
    public Motorcycle(String brand, String model, int fuelLevel) {
        super(brand, model, fuelLevel);
    }

    @Override
    public void start() {
        System.out.println("The motorcycle is started to move");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle is stopped");
    }

    @Override
    public void refuel() {
        fuelUp(MAX_FUEL_LEVEL - getFuelLevel());
    }

    public void wheelie() {
        System.out.println("wheelie");
    }
}
