public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(200);

        context.setPaymentStrategy(new CryptoPayment());
        context.executePayment(300);
    }
}
