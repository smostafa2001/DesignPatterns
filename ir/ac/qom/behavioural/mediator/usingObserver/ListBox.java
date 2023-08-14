package ir.ac.qom.behavioural.mediator.usingObserver;

public class ListBox extends UIControl {
    private String _selection;

    public String getSelection() {return _selection;}

    public void setSelection(String selection) {
        _selection = selection;
        notifyEventHandlers();
    }
}
