package vehicle;

public class Car extends AbstractVehicle{
    public Car(String brand, String model, int fuelLevel) {
        super(brand, model, fuelLevel);
    }

    @Override
    public void start() {
        System.out.println("The car is started to move");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }

    @Override
    public void refuel() {
        fuelUp(MAX_FUEL_LEVEL - getFuelLevel());
    }

    public void honk() {
        System.out.println("honk");
    }
}
