package ir.ac.qom.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class PlainHTMLDocument {
    private List<HTMLNode> nodes = new ArrayList<>();

    public void add(HTMLNode node) {nodes.add(node);}

    public void execute(Operation operation) {
        for (var node : nodes) node.execute(operation);
    }
}
