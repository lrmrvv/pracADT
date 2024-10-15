public class TradingPlatformObserver implements IObserver {
    private String platformName;

    public TradingPlatformObserver(String platformName) {
        this.platformName = platformName;
    }

    @Override
    public void update(double exchangeRate) {
        System.out.println(platformName + ": новый курс валют - " + exchangeRate);
    }
}
