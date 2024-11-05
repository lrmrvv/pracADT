import java.util.ArrayList;
import java.util.List;

public abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void display(int depth);

    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    public FileSystemComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
