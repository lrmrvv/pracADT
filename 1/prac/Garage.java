import java.util.ArrayList;
import java.util.List;

class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    // Методы для добавления и удаления транспортных средств
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle.getClass().getSimpleName() + " добавлено к гаражу.");
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println(vehicle.getClass().getSimpleName() + " удалено из гаража.");
    }

    // Метод для отображения всех транспортных средств в гараже
    public void displayVehicles() {
        System.out.println("Транспортные средства в гараже:");
        for (Vehicle vehicle : vehicles) {
            vehicle.Info();
        }
    }

    // Метод для поиска транспортного средства по модели
    public Vehicle searchVehicle(String model) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.rModel().equals(model)) {
                return vehicle;
            }
        }
        return null; // Если транспортное средство не найдено
    }
}
