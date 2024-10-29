class Coffee implements IBeverage {
    @Override
    public double getCost() {
        return 50.0; 
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
