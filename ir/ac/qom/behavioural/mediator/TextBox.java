package ir.ac.qom.behavioural.mediator;

public class TextBox extends UIControl {
    private String _content;

    public TextBox(DialogBox owner) {super(owner);}

    public String getContent() {return _content;}

    public void setContent(String content) {
        _content = content;
        _owner.changed(this);
    }
}
