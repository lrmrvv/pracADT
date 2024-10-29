interface IPaymentProcessor {
    void processPayment(double amount);    
    void refundPayment(double amount);    
}
