import java.util.Scanner;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }

    @Override
    protected boolean customerWantsCondiments() {
        System.out.println("Would you like sugar and milk with your coffee? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.toLowerCase().equals("y");
    }
}
