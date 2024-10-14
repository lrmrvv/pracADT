public class ReportCreator implements DocumentCreator {
    @Override
    public Document CreatorDocument() {
        return new Report();
    }
}

public class ResumeCreator implements DocumentCreator {
    @Override
    public Document CreatorDocument() {
        return new Report();
    }
}

public class LetterCreator implements DocumentCreator{
    @Override
    public Document CreatorDocument() {
        return new Report();
    }
}
