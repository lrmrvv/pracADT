import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип документа (1 - Отчет, 2 - Резюме, 3 - Письмо): ");
        int choice = scanner.nextInt();

        DocumentCreator factory = null;

        switch (choice) {
            case 1:
                factory = new ReportCreator();
                break;
            case 2:
                factory = new ResumeCreator();
                break;
            case 3:
                factory = new LetterCreator();
                break;
            default:
                System.out.println("Неверный выбор.");
                System.exit(0);
        }

        Document document = factory.CreatorDocument();
        document.Open();
    }

}
