public interface IPrintable {
    void print(String content);
}

public interface IScannable {
    void scan(String content);
}

public interface IFaxable {
    void fax(String content);
}

public class AllInOnePrinter implements IPrintable, IScannable, IFaxable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}

public class BasicPrinter implements IPrintable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}

public class Scanner implements IScannable {
    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }
}

public class Main {
    public static void main(String[] args) {
        IPrintable allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print("Документ для печати");

        IScannable scanner = new Scanner();
        scanner.scan("Документ для сканирования");

        IFaxable faxMachine = new AllInOnePrinter(); 
        faxMachine.fax("Документ для факса");
    }
}
