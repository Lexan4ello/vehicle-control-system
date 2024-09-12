package vehicle;

public abstract class AbstractVehicle implements Vehicle {
    private final String brand;
    private final String model;
    private int fuelLevel;

    public AbstractVehicle(String brand, String model, int fuelLevel) {
        this.brand = brand;
        this.model = model;
        setFuelLevel(fuelLevel);
    }

    protected int getFuelLevel() {
        return fuelLevel;
    }
    protected void setFuelLevel(int fuelLevel) {
        if (fuelLevel < 0) {
            throw new IllegalArgumentException("The fuel level cannot be below zero");
        }
        if (fuelLevel > MAX_FUEL_LEVEL) {
            throw new IllegalArgumentException("Fuel tank value exceeded");
        }

        this.fuelLevel = fuelLevel;
    }

    protected void fuelUp(int litresOfFuel) {
        int currentFuelLevel = getFuelLevel();
        int fuelLevel = currentFuelLevel + litresOfFuel;
        setFuelLevel(fuelLevel);

        System.out.println(this.getClass().getName() + " refuel. Fuel level is " + fuelLevel);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel;
    }
}
