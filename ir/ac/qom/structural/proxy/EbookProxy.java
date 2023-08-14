package ir.ac.qom.structural.proxy;

public class EbookProxy implements Ebook {
    private String _fileName;
    private RealEbook _ebook;

    public EbookProxy(String fileName) {_fileName = fileName;}

    @Override
    public void show() {
        if (_ebook == null) _ebook = new RealEbook(_fileName);
        _ebook.show();
    }

    @Override
    public String getFileName() {return _fileName;}
}
