class Car extends Vehicle {
    private int doors;
    private String transmissii;

    public Car(String brand, String model, int year, int doors, String transmissii) {
        super(brand, model, year);
        this.doors = doors;
        this.transmissii = transmissii;
    }

    @Override
    public void Info() {
        System.out.println("Машина: " + rBrand() + " " + rModel() + ", года: " + rYear() +
                ", Дверей: " + doors + ", Тип трансмиссии: " + transmissii);
    }
}
