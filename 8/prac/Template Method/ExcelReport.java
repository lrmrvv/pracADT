public class ExcelReport extends ReportGenerator {

    @Override
    protected void processReportData() {
        System.out.println("Обработка данных отчета Excel...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Форматирование отчета Excel...");
    }

    @Override
    protected boolean customerWantsSave() {
        return true; 
    }
}
