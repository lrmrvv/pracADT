public class PaymentSystemDemo {
    public static void main(String[] args) {
        IPaymentProcessor internalProcessor = PaymentSystemFactory.getPaymentProcessor("ВНУТРЕННИЙ");
        internalProcessor.processPayment(100.0);
        internalProcessor.refundPayment(50.0);

        IPaymentProcessor adapterA = PaymentSystemFactory.getPaymentProcessor("ВНЕШНИЙ_A");
        adapterA.processPayment(200.0);
        adapterA.refundPayment(100.0);

        IPaymentProcessor adapterB = PaymentSystemFactory.getPaymentProcessor("ВНЕШНИЙ_B");
        adapterB.processPayment(300.0);
        adapterB.refundPayment(150.0);

        String region = "US"; 
        IPaymentProcessor paymentProcessor;
        if (region.equals("US")) {
            paymentProcessor = PaymentSystemFactory.getPaymentProcessor("ВНЕШНИЙ_A");
        } else {
            paymentProcessor = PaymentSystemFactory.getPaymentProcessor("ВНЕШНИЙ_B");
        }
        paymentProcessor.processPayment(400.0);
        paymentProcessor.refundPayment(200.0);
    }
}
