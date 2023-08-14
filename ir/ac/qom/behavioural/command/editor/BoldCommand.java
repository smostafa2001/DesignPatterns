package ir.ac.qom.behavioural.command.editor;

public class BoldCommand implements UndoableCommand {
    private String _prevContent;
    private HTMLDocument _document;
    private History _history;

    public BoldCommand(HTMLDocument document, History history) {
        _document = document;
        _history = history;
    }

    @Override
    public void execute() {
        _prevContent = _document.getContent();
        _document.makeBold();
        _history.push(this);
    }

    @Override
    public void unexecute() {_document.setContent(_prevContent);}
}
