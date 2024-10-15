public class CurrencyExchange implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private double exchangeRate;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(exchangeRate);
        }
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
        notifyObservers();
    }
}
