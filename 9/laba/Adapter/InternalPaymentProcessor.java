class InternalPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежей по " + amount + " через внутреннюю систему.");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Возврат оплаты за " + amount + " через внутреннюю систему.");
    }
}
