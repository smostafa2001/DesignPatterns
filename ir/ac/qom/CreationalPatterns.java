package ir.ac.qom;

import ir.ac.qom.creational.abstractFactory.app.ContactForm;
import ir.ac.qom.creational.abstractFactory.material.MaterialWidgetFactory;
import ir.ac.qom.creational.builder.MovieBuilder;
import ir.ac.qom.creational.builder.Presentation;
import ir.ac.qom.creational.builder.Slide;
import ir.ac.qom.creational.factory.ProductsController;
import ir.ac.qom.creational.singleton.ConfigManager;

public class CreationalPatterns {
    public static void builder() {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        var builder = new MovieBuilder();
        presentation.export(builder);
        var movie = builder.getMovie();
    }

    public static void abstractFactory() {
        new ContactForm().render(new MaterialWidgetFactory());
    }

    public static void factory() {
        new ProductsController().listProducts();
    }

    public static void singleton() {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Mosh");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
