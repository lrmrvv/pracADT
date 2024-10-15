public class PayPalPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " через PayPal.");
    }
}
