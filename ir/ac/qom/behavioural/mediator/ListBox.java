package ir.ac.qom.behavioural.mediator;

public class ListBox extends UIControl {
    private String _selection;

    public ListBox(DialogBox owner) {super(owner);}

    public String getSelection() {return _selection;}

    public void setSelection(String selection) {
        _selection = selection;
        _owner.changed(this);
    }
}
