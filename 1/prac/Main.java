public class Main {
    public static void main(String[] args) {
        // Создание транспортных средств
        Car car1 = new Car("Toyota", "Corolla", 2020, 4, "Automatic");
        Motorcycle moto1 = new Motorcycle("Harley", "Sportster", 2019, "Cruiser", false);

        // Создание гаража и добавление в него транспортных средств
        Garage garage1 = new Garage();
        garage1.addVehicle(car1);
        garage1.addVehicle(moto1);

        // Отображение транспортных средств в гараже
        garage1.displayVehicles();

        // Создание автопарка и добавление гаража
        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);

        // Поиск транспортного средства в автопарке
        fleet.searchVehicle("Corolla");

        // Удаление транспортных средств и гаражей
        garage1.removeVehicle(car1);
        fleet.removeGarage(garage1);
    }
}
