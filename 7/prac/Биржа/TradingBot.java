public class TradingBot implements IObserver {
    private double threshold;

    public TradingBot(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        if (stockPrice > threshold) {
            System.out.printf("Робот продает акции %s по цене %.2f%n", stockSymbol, stockPrice);
        } else {
            System.out.printf("Робот покупает акции %s по цене %.2f%n", stockSymbol, stockPrice);
        }
    }
}
