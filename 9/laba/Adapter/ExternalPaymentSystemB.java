class ExternalPaymentSystemB {
    public void sendPayment(double amount) {
        System.out.println("Отправка платежа в размере " + amount + " через Внешнюю платежную систему B.");
    }

    public void processRefund(double amount) {
        System.out.println("Обработка возврата " + amount + " через внешнюю платежную систему B.");
    }
}
