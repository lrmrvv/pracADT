public class AirplaneCostStrategy implements ICostCalculationStrategy {
    @Override
    public double calculateCost(double distance, int passengers, String serviceClass) {
        double baseCost = distance * 0.5;
        double classMultiplier = "business".equalsIgnoreCase(serviceClass) ? 1.5 : 1.0;
        return baseCost * passengers * classMultiplier;
    }
}
