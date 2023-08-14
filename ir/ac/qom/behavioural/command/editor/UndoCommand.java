package ir.ac.qom.behavioural.command.editor;

public class UndoCommand implements Command {
    private History _history;

    public UndoCommand(History history) {_history = history;}

    @Override
    public void execute() {
        if (_history.size() > 0)
            _history.pop().unexecute();
    }
}
