package ir.ac.qom.creational.abstractFactory.ant;

import ir.ac.qom.creational.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
