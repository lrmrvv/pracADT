public class StockExchangeApp {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        Trader trader1 = new Trader("Алексей");
        TradingBot bot = new TradingBot(100);

        stockExchange.addObserver(trader1);
        stockExchange.addObserver(bot);

        stockExchange.changeStockPrice("AAPL", 120.5);
        stockExchange.changeStockPrice("AAPL", 95.0);
    }
}
