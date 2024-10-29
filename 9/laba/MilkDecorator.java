class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0; 
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}

