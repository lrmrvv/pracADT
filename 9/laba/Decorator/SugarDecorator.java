class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0; 
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
