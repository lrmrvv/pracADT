public class Trader implements IObserver {
    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.printf("Трейдер %s получил уведомление: Акция %s стоит %.2f%n", name, stockSymbol, stockPrice);
    }
}
