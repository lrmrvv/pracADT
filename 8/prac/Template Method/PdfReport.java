public class PdfReport extends ReportGenerator {

    @Override
    protected void processReportData() {
        System.out.println("Обработка данных отчета в формате PDF...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Форматирование отчета в формате PDF...");
    }
}
