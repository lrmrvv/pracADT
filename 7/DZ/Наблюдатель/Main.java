public class Main {
    public static void main(String[] args) {
        CurrencyExchange exchange = new CurrencyExchange();

        IObserver bank1 = new BankObserver("Bank A");
        IObserver platform1 = new TradingPlatformObserver("Platform X");

        exchange.addObserver(bank1);
        exchange.addObserver(platform1);

        exchange.setExchangeRate(75.5);
        exchange.setExchangeRate(77.2);

        exchange.removeObserver(bank1);

        exchange.setExchangeRate(78.0);
    }
}
