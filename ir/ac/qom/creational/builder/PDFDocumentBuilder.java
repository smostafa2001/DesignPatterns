package ir.ac.qom.creational.builder;

public class PDFDocumentBuilder implements PresentationBuilder {
    private PDFDocument document = new PDFDocument();

    @Override
    public void addSlide(Slide slide) {document.addPage(slide.getText());}

    public PDFDocument getPDFDocument() {return document;}
}
