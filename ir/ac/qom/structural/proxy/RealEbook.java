package ir.ac.qom.structural.proxy;

public class RealEbook implements Ebook {
    private String _fileName;

    public RealEbook(String fileName) {
        _fileName = fileName;
        load();
    }

    private void load() {System.out.println("Loading the ebook " + _fileName);}

    @Override
    public void show() {System.out.println("Showing the ebook " + _fileName);}

    @Override
    public String getFileName() {return _fileName;}
}
