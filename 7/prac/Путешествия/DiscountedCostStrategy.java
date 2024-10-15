public class DiscountedCostStrategy implements ICostCalculationStrategy {
    private ICostCalculationStrategy baseStrategy;
    private double discount;

    public DiscountedCostStrategy(ICostCalculationStrategy baseStrategy, double discount) {
        this.baseStrategy = baseStrategy;
        this.discount = discount;
    }

    @Override
    public double calculateCost(double distance, int passengers, String serviceClass) {
        return baseStrategy.calculateCost(distance, passengers, serviceClass) * (1 - discount);
    }
}
