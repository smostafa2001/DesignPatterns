package ir.ac.qom.behavioural.state;

public class Canvas {
    private Tool _currentTool;

    public Tool getCurrentTool() {return _currentTool;}

    public void setCurrentTool(Tool currentTool) {_currentTool = currentTool;}

    public void mouseDown() {_currentTool.mouseDown();}

    public void mouseUp() {_currentTool.mouseUp();}
}
