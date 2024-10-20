public class ReportGeneratorClient {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PdfReport();
        ReportGenerator excelReport = new ExcelReport();
        ReportGenerator htmlReport = new HtmlReport();

        System.out.println("Создание отчета в формате PDF:");
        pdfReport.generateReport();

        System.out.println("Создание отчета в формате Excel");
        excelReport.generateReport();

        System.out.println("Создание HTML-отчета");
        htmlReport.generateReport();
    }
}
