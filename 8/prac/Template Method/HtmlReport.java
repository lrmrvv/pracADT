public class HtmlReport extends ReportGenerator {

    @Override
    protected void processReportData() {
        System.out.println("Обработка данных HTML-отчета...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Форматирование HTML-отчета...");
    }

    @Override
    protected boolean customerWantsEmail() {
        return true;
    }
}
