public class Car implements IVehicle {
    private String brand;
    private String model;
    private String fuelType;

    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    @Override
    public void drive() {
        System.out.println(brand + " " + model + " едет на " + fuelType + ".");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка автомобиля " + brand + " " + model + " топливом " + fuelType + ".");
    }
}


public class Motorcycle implements IVehicle {
    private String type;
    private int engineCapacity;

    public Motorcycle(String type, int engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void drive() {
        System.out.println(type + " мотоцикл с объемом двигателя " + engineCapacity + "cc едет.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка мотоцикла с объемом двигателя " + engineCapacity + "cc.");
    }
}


public class Truck implements IVehicle {
    private int capacity;
    private int axles;

    public Truck(int capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("Грузовик с грузоподъемностью " + capacity + " тонн и " + axles + " осями едет.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка грузовика с грузоподъемностью " + capacity + " тонн.");
    }
}



public class Bus implements IVehicle {
    private int seatingCapacity;

    public Bus(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Автобус с вместимостью " + seatingCapacity + " пассажиров едет.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка автобуса на " + seatingCapacity + " мест.");
    }
}
