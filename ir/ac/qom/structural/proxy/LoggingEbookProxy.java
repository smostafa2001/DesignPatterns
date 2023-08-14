package ir.ac.qom.structural.proxy;

public class LoggingEbookProxy implements Ebook {
    private String _fileName;
    private RealEbook _ebook;

    public LoggingEbookProxy(String fileName) {_fileName = fileName;}

    @Override
    public void show() {
        if (_ebook == null) _ebook = new RealEbook(_fileName);
        System.out.println("Logging");
        _ebook.show();
    }

    @Override
    public String getFileName() {return _fileName;}
}
