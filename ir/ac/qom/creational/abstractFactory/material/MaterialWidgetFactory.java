package ir.ac.qom.creational.abstractFactory.material;

import ir.ac.qom.creational.abstractFactory.Button;
import ir.ac.qom.creational.abstractFactory.TextBox;
import ir.ac.qom.creational.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {return new MaterialButton();}

    @Override
    public TextBox createTextBox() {return new MaterialTextBox();}
}
