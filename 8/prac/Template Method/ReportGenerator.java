public abstract class ReportGenerator {

    public final void generateReport() {
        fetchData();
        processReportData();
        formatReport();
        if (customerWantsSave()) {
            saveReport();
        }
        if (customerWantsEmail()) {
            emailReport();
        }
    }

    protected void fetchData() {
        System.out.println("Fetching data...");
    }

    protected abstract void processReportData();

    protected abstract void formatReport();

    protected void saveReport() {
        System.out.println("Сохранение отчета...");
    }

    protected boolean customerWantsSave() {
        return true;  
    }

    protected boolean customerWantsEmail() {
        return false;
    }

    protected void emailReport() {
        System.out.println("Отчет по электронной почте...");
    }
}
