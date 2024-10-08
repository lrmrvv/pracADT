class Motorcycle extends Vehicle {
    private String typeKusov;
    private boolean boxes;

    public Motorcycle(String brand, String model, int year, String typeKusov, boolean boxes) {
        super(brand, model, year);
        this.typeKusov = typeKusov;
        this.boxes = boxes;
    }

    @Override
    public void Info() {
        System.out.println("Мотоцикл: " + rBrand() + " " + rModel() + ", года: " + rYear() +
                ", Тип кузова: " + typeKusov + ", Наличие бокса: " + (boxes ? "Да" : "Нет"));
    }
}
