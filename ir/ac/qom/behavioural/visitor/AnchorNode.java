package ir.ac.qom.behavioural.visitor;

public class AnchorNode implements HTMLNode {
    @Override
    public void execute(Operation operation) {operation.apply(this);}
}
