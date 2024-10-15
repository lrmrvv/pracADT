public class BankObserver implements IObserver {
    private String bankName;

    public BankObserver(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void update(double exchangeRate) {
        System.out.println(bankName + ": курс валют изменился на " + exchangeRate);
    }
}
