package ir.ac.qom;

import ir.ac.qom.behavioural.chainOfResponsibility.*;
import ir.ac.qom.behavioural.command.*;
import ir.ac.qom.behavioural.command.editor.BoldCommand;
import ir.ac.qom.behavioural.command.editor.HTMLDocument;
import ir.ac.qom.behavioural.command.editor.History;
import ir.ac.qom.behavioural.command.editor.UndoCommand;
import ir.ac.qom.behavioural.command.fx.Button;
import ir.ac.qom.behavioural.iterator.BrowseHistory;
import ir.ac.qom.behavioural.iterator.Iterator;
import ir.ac.qom.behavioural.mediator.ArticlesDialogBox;
import ir.ac.qom.behavioural.memento.Editor;
import ir.ac.qom.behavioural.memento.EditorHistory;
import ir.ac.qom.behavioural.observer.Chart;
import ir.ac.qom.behavioural.observer.DataSource;
import ir.ac.qom.behavioural.observer.SpreadSheet;
import ir.ac.qom.behavioural.state.Canvas;
import ir.ac.qom.behavioural.state.SelectionTool;
import ir.ac.qom.behavioural.state.abuse.Stopwatch;
import ir.ac.qom.behavioural.strategy.BlackAndWhiteFilter;
import ir.ac.qom.behavioural.strategy.ImageStorage;
import ir.ac.qom.behavioural.strategy.JpegCompressor;
import ir.ac.qom.behavioural.strategy.PngCompressor;
import ir.ac.qom.behavioural.template.TransferMoneyTask;
import ir.ac.qom.behavioural.visitor.AnchorNode;
import ir.ac.qom.behavioural.visitor.HeadingNode;
import ir.ac.qom.behavioural.visitor.PlainHTMLDocument;
import ir.ac.qom.behavioural.visitor.PlainTextOperation;

public class BehaviouralPatterns {
    public static void visitor() {
        var document = new PlainHTMLDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new PlainTextOperation());
    }

    public static void chainOfResponsibility() {
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }

    public static void mediator() {
        var dialogBox = new ArticlesDialogBox();
        dialogBox.simulateUserInteraction();
    }

    public static void observer() {
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }

    public static void undoCommand() {
        var history = new History();
        var document = new HTMLDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }

    public static void compositeCommand() {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }

    public static void command() {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }

    public static void templateMethod() {
        var task = new TransferMoneyTask();
        task.execute();
    }

    public static void strategy() {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());
    }

    public static void iterator() {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }

    public static void stateAbuse() {
        var stopwatch = new Stopwatch();
        stopwatch.click();
    }

    public static void state() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    public static void memento() {
        var editor = new Editor();
        var history = new EditorHistory();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
