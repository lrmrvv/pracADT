class PaymentSystemFactory {
    public static IPaymentProcessor getPaymentProcessor(String systemType) {
        switch (systemType) {
            case "ВНУТРЕННИЙ":
                return new InternalPaymentProcessor();
            case "ВНЕШНИЙ_A":
                return new PaymentAdapterA(new ExternalPaymentSystemA());
            case "ВНЕШНИЙ_B":
                return new PaymentAdapterB(new ExternalPaymentSystemB());
            default:
                throw new IllegalArgumentException("Неподдерживаемый тип платежной системы");
        }
    }
}
