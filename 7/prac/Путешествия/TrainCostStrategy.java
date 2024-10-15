public class TrainCostStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, int passengers, String serviceClass) {
        double baseCost = distance * 0.2;
        double classMultiplier = "business".equalsIgnoreCase(serviceClass) ? 1.3 : 1.0;
        return baseCost * passengers * classMultiplier;
    }
}
