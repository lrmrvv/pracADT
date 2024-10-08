import java.util.List;
import java.util.ArrayList;

class Fleet {
    private List<Garage> garages;

    public Fleet() {
        garages = new ArrayList<>();
    }

    // Методы для добавления и удаления гаражей
    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Гараж пополнил автопарк.");
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Гараж выведен из состава автопарка.");
    }

    // Метод для поиска транспортного средства по модели
    public void searchVehicle(String model) {
        System.out.println("Поиск транспортного средства: " + model);
        for (Garage garage : garages) {
            Vehicle vehicle = garage.searchVehicle(model);
            if (vehicle != null) {
                System.out.println("Транспортное средство найдено в гараже: ");
                vehicle.Info();
                return;
            }
        }
        System.out.println("Транспортное средство не найдено.");
    }
}
