package ir.ac.qom.behavioural.memento;

import java.util.Stack;

public class EditorHistory {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {states.push(state);}

    public EditorState pop() {return states.pop();}
}
