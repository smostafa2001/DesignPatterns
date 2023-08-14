package ir.ac.qom.behavioural.mediator.usingObserver;

public class TextBox extends UIControl {
    private String _content;

    public String getContent() {return _content;}

    public void setContent(String content) {
        _content = content;
        notifyEventHandlers();
    }
}
