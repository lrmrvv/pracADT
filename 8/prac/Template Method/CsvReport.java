public class CsvReport extends ReportGenerator {

    @Override
    protected void processReportData() {
        System.out.println("Обработка данных отчета в формате CSV...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Форматирование отчета в формате CSV...");
    }

    @Override
    protected boolean customerWantsSave() {
        return true; 
    }
}
