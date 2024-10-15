public class TravelBookingContext {
    private ICostCalculationStrategy strategy;

    public void setCostCalculationStrategy(ICostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateCost(double distance, int passengers, String serviceClass) {
        if (strategy == null) {
            throw new IllegalStateException("Стратегия расчета не установлена.");
        }
        return strategy.calculateCost(distance, passengers, serviceClass);
    }
}
