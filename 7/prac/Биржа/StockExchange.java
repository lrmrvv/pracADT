import java.util.ArrayList;
import java.util.List;

public class StockExchange implements ISubject {
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol, double stockPrice) {
        for (IObserver observer : observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }

    public void changeStockPrice(String stockSymbol, double newPrice) {
        System.out.printf("Новая цена акции %s: %.2f%n", stockSymbol, newPrice);
        notifyObservers(stockSymbol, newPrice);
    }
}
