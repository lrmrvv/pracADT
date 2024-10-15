public class BusCostStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, int passengers, String serviceClass) {
        double baseCost = distance * 0.1;
        return baseCost * passengers;
    }
}
