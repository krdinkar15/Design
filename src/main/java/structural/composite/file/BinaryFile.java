package structural.composite.file;
// Leaf node in composite Pattern :
public class BinaryFile extends File{
    private long size;

    public BinaryFile(String name,long size) {
        super(name);
        this.size=size;
    }

    @Override
    public void ls() {
        System.out.println(getName() +"\t"+size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't support addFile() operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node doesn't support getFiles() operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't support removeFile() operation");
    }
}
