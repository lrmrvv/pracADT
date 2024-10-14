public class CarFactory extends VehicleFactory {
    private String brand;
    private String model;
    private String fuelType;

    public CarFactory(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    @Override
    public IVehicle createVehicle() {
        return new Car(brand, model, fuelType);
    }
}



public class MotorcycleFactory extends VehicleFactory {
    private String type;
    private int engineCapacity;

    public MotorcycleFactory(String type, int engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public IVehicle createVehicle() {
        return new Motorcycle(type, engineCapacity);
    }
}



public class TruckFactory extends VehicleFactory {
    private int capacity;
    private int axles;

    public TruckFactory(int capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public IVehicle createVehicle() {
        return new Truck(capacity, axles);
    }
}



public class BusFactory extends VehicleFactory {
    private int seatingCapacity;

    public BusFactory(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(seatingCapacity);
    }
}
