public interface SalaryCalculator {
    double calculateSalary(Employee employee);
}

public class PermanentEmployeeSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.2; 
    }
}

public class ContractEmployeeSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.1; 
    }
}

public class InternSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 0.8; 
    }
}

public class FreelancerSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary(); 
    }
}

public class Employee {
    private String name;
    private double baseSalary;
    private String employeeType; 

    public Employee(String name, double baseSalary, String employeeType) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getEmployeeType() {
        return employeeType;
    }
}

public class EmployeeSalaryCalculator {
    public double calculateSalary(Employee employee) {
        SalaryCalculator calculator;

        switch (employee.getEmployeeType()) {
            case "Permanent":
                calculator = new PermanentEmployeeSalaryCalculator();
                break;
            case "Contract":
                calculator = new ContractEmployeeSalaryCalculator();
                break;
            case "Intern":
                calculator = new InternSalaryCalculator();
                break;
            case "Freelancer":
                calculator = new FreelancerSalaryCalculator();
                break;
            default:
                throw new UnsupportedOperationException("Тип сотрудника не поддерживается");
        }

        return calculator.calculateSalary(employee);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee permanentEmployee = new Employee("Иван Петров", 3000, "Permanent");
        Employee contractEmployee = new Employee("Мария Иванова", 4000, "Contract");
        Employee intern = new Employee("Сергей Сидоров", 2000, "Intern");
        Employee freelancer = new Employee("Алексей Смирнов", 3500, "Freelancer");

        EmployeeSalaryCalculator salaryCalculator = new EmployeeSalaryCalculator();
        
        System.out.println("Зарплата постоянного сотрудника: " + salaryCalculator.calculateSalary(permanentEmployee));
        System.out.println("Зарплата контрактного сотрудника: " + salaryCalculator.calculateSalary(contractEmployee));
        System.out.println("Зарплата стажера: " + salaryCalculator.calculateSalary(intern));
        System.out.println("Зарплата фрилансера: " + salaryCalculator.calculateSalary(freelancer));
    }
}
