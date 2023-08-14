package ir.ac.qom.behavioural.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
