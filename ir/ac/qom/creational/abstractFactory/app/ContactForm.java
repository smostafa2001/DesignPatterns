package ir.ac.qom.creational.abstractFactory.app;

import ir.ac.qom.creational.abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
