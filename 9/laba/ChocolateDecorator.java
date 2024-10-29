class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0; 
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }
}
