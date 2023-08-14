package ir.ac.qom.behavioural.command.editor;

public class HTMLDocument {
    private String _content;

    public String getContent() {return _content;}

    public void setContent(String content) {_content = content;}

    public void makeBold() {_content = "<b>" + _content + "</b>";}
}
