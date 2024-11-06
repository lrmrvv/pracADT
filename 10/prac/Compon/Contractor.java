class Contractor extends OrganizationComponent {
    private String position;
    private double fixedPayment;

    public Contractor(String name, String position, double fixedPayment) {
        super(name);
        this.position = position;
        this.fixedPayment = fixedPayment;
    }

    @Override
    public void displayHierarchy() {
        System.out.println("Контрактор: " + name + ", Должность: " + position + ", Оплата: " + fixedPayment);
    }

    @Override
    public double calculateBudget() {
        return 0; 
    }

    @Override
    public int countEmployees() {
        return 1;
    }
}
