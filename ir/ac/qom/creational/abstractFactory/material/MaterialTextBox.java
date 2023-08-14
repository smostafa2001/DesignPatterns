package ir.ac.qom.creational.abstractFactory.material;

import ir.ac.qom.creational.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
