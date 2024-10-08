import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Методы для запуска и остановки двигателя
    public void start() {
        System.out.println(brand + " " + model + ": Двигатель запущен.");
    }

    public void stop() {
        System.out.println(brand + " " + model + ": Двигатель остановился.");
    }

    public String rBrand() { return brand; }
    public String rModel() { return model; }
    public int rYear() { return year; }

    // абстрактный метод для отображения информации
    public abstract void Info();
}

