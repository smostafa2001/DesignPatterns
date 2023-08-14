package ir.ac.qom.behavioural.command.fx;

public class Button {
    private String _label;
    private Command _command;

    public Button(Command command) {_command = command;}

    public String getLabel() {return _label;}

    public void setLabel(String label) {_label = label;}

    public void click() {_command.execute();}
}
