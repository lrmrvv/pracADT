class Employee extends OrganizationComponent {
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayHierarchy() {
        System.out.println("Сотрудник: " + name + ", Должность: " + position + ", Зарплата: " + salary);
    }

    @Override
    public double calculateBudget() {
        return salary;
    }

    @Override
    public int countEmployees() {
        return 1;
    }
}
