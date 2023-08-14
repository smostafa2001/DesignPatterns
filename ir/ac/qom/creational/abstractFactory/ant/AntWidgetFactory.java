package ir.ac.qom.creational.abstractFactory.ant;

import ir.ac.qom.creational.abstractFactory.Button;
import ir.ac.qom.creational.abstractFactory.TextBox;
import ir.ac.qom.creational.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {return new AntButton();}

    @Override
    public TextBox createTextBox() {return new AntTextBox();}
}
