public class Order {
    private String productName;
    private int quantity;
    private double price;

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

public class PriceCalculator {
    public double calculateTotalPrice(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9; 
    }
}

public class PaymentProcessor {
    public void processPayment(String paymentDetails) {
        System.out.println("Платеж обработан с использованием: " + paymentDetails);
    }
}

public class NotificationService {
    public void sendConfirmationEmail(String email) {
        System.out.println("Подтверждающее письмо отправлено на: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Товар1", 2, 100.0);
        
        PriceCalculator priceCalculator = new PriceCalculator();
        double totalPrice = priceCalculator.calculateTotalPrice(order);
        System.out.println("Общая стоимость: " + totalPrice);
        
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("Кредитная карта");

        NotificationService notificationService = new NotificationService();
        notificationService.sendConfirmationEmail("Laura@gmail.com");
    }
}
