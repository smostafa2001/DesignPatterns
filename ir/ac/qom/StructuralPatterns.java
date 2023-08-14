package ir.ac.qom;

import ir.ac.qom.structural.adapter.CaramelFilter;
import ir.ac.qom.structural.adapter.Image;
import ir.ac.qom.structural.adapter.ImageView;
import ir.ac.qom.structural.adapter.avaFilters.Caramel;
import ir.ac.qom.structural.bridge.AdvancedRemoteControl;
import ir.ac.qom.structural.bridge.SamsungTV;
import ir.ac.qom.structural.composite.Group;
import ir.ac.qom.structural.composite.Shape;
import ir.ac.qom.structural.decorator.CloudStream;
import ir.ac.qom.structural.decorator.CompressedCloudStream;
import ir.ac.qom.structural.decorator.EncryptedCloudStream;
import ir.ac.qom.structural.facade.NotificationService;
import ir.ac.qom.structural.flyweight.PointIconFactory;
import ir.ac.qom.structural.flyweight.PointService;
import ir.ac.qom.structural.proxy.Library;
import ir.ac.qom.structural.proxy.LoggingEbookProxy;

public class StructuralPatterns {
    public static void proxy() {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames) library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
    }

    public static void bridge() {
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }

    public static void flyweight() {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints()) point.draw();
    }

    public static void facade() {
        var service = new NotificationService();
        service.send("Hello World!", "target");
    }

    public static void decorator() {
        var stream = new CompressedCloudStream(new EncryptedCloudStream(new CloudStream()));
        stream.write("1234-1234-1234-1234");
    }

    public static void adapter() {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }

    public static void composite() {
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }
}
