public class CorporateHierarchy {
    public static void main(String[] args) {
        Department headOffice = new Department("Головной офис");

        Department hrDepartment = new Department("Отдел кадров");
        hrDepartment.add(new Employee("Иван Иванов", "Менеджер по персоналу", 50000));
        hrDepartment.add(new Employee("Мария Петрова", "Рекрутер", 40000));

        Department itDepartment = new Department("IT отдел");
        itDepartment.add(new Employee("Сергей Сергеев", "Разработчик", 70000));
        itDepartment.add(new Employee("Анна Смирнова", "Системный администратор", 60000));

        Department subITDepartment = new Department("Отдел QA");
        subITDepartment.add(new Employee("Ольга Кузнецова", "Тестировщик", 50000));
        itDepartment.add(subITDepartment);

        headOffice.add(hrDepartment);
        headOffice.add(itDepartment);

        headOffice.displayHierarchy();

        System.out.println("Общий бюджет компании: " + headOffice.calculateBudget());

        System.out.println("Общее количество сотрудников: " + headOffice.countEmployees());
    }
}
