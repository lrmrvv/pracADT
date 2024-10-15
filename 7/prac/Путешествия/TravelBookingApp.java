import java.util.Scanner;

public class TravelBookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelBookingContext bookingContext = new TravelBookingContext();

        System.out.println("Выберите тип транспорта: 1 - Самолет, 2 - Поезд, 3 - Автобус");
        int transportChoice = scanner.nextInt();

        switch (transportChoice) {
            case 1:
                bookingContext.setCostCalculationStrategy(new AirplaneCostStrategy());
                break;
            case 2:
                bookingContext.setCostCalculationStrategy(new TrainCostStrategy());
                break;
            case 3:
                bookingContext.setCostCalculationStrategy(new BusCostStrategy());
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.println("Введите расстояние (км):");
        double distance = scanner.nextDouble();

        System.out.println("Введите количество пассажиров:");
        int passengers = scanner.nextInt();

        System.out.println("Выберите класс обслуживания (econom, business):");
        String serviceClass = scanner.next();

        double cost = bookingContext.calculateCost(distance, passengers, serviceClass);
        System.out.printf("Стоимость поездки: %.2f%n", cost);
    }
}
