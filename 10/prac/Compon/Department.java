class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void displayHierarchy() {
        System.out.println("Отдел: " + name);
        for (OrganizationComponent component : components) {
            component.displayHierarchy();
        }
    }

    @Override
    public double calculateBudget() {
        double totalBudget = 0;
        for (OrganizationComponent component : components) {
            totalBudget += component.calculateBudget();
        }
        return totalBudget;
    }

    @Override
    public int countEmployees() {
        int totalEmployees = 0;
        for (OrganizationComponent component : components) {
            totalEmployees += component.countEmployees();
        }
        return totalEmployees;
    }

    public OrganizationComponent findEmployeeByName(String name) {
    for (OrganizationComponent component : components) {
        if (component instanceof Employee && component.getName().equals(name)) {
            return component;
        } else if (component instanceof Department) {
            OrganizationComponent found = ((Department) component).findEmployeeByName(name);
            if (found != null) {
                return found;
            }
        }
    }
    return null;
}


    public List<Employee> getAllEmployees() {
    List<Employee> employees = new ArrayList<>();
    for (OrganizationComponent component : components) {
        if (component instanceof Employee) {
            employees.add((Employee) component);
        } else if (component instanceof Department) {
            employees.addAll(((Department) component).getAllEmployees());
        }
    }
    return employees;
}

}
