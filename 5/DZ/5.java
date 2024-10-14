import java.util.Scanner;

public class VehicleSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Выберите тип транспортного средства: 1. Автомобиль, 2. Мотоцикл, 3. Грузовик, 4. Автобус");
        String choice = scanner.nextLine();

        VehicleFactory factory = null;

        switch (choice) {
            case "1":
                System.out.println("Введите марку автомобиля:");
                String carBrand = scanner.nextLine();
                System.out.println("Введите модель автомобиля:");
                String carModel = scanner.nextLine();
                System.out.println("Введите тип топлива:");
                String fuelType = scanner.nextLine();
                factory = new CarFactory(carBrand, carModel, fuelType);
                break;

            case "2":
                System.out.println("Введите тип мотоцикла (спортивный, туристический):");
                String motoType = scanner.nextLine();
                System.out.println("Введите объем двигателя:");
                int engineCapacity = scanner.nextInt();
                factory = new MotorcycleFactory(motoType, engineCapacity);
                break;

            case "3":
                System.out.println("Введите грузоподъемность грузовика (в тоннах):");
                int capacity = scanner.nextInt();
                System.out.println("Введите количество осей:");
                int axles = scanner.nextInt();
                factory = new TruckFactory(capacity, axles);
                break;

            case "4":
                System.out.println("Введите количество мест в автобусе:");
                int seatingCapacity = scanner.nextInt();
                factory = new BusFactory(seatingCapacity);
                break;

            default:
                System.out.println("Неверный выбор.");
                return;
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();
        
        scanner.close();
    }
}




/*Пример вывода
Выберите тип транспортного средства: 1. Автомобиль, 2. Мотоцикл, 3. Грузовик, 4. Автобус
1
Введите марку автомобиля:
Toyota
Введите модель автомобиля:
Corolla
Введите тип топлива:
Бензин
Toyota Corolla едет на Бензин.
Заправка автомобиля Toyota Corolla топливом Бензин.*/
