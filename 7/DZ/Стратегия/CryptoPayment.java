public class CryptoPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " через криптовалюту.");
    }
}
