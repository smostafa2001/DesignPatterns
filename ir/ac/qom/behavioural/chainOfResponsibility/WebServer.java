package ir.ac.qom.behavioural.chainOfResponsibility;

public class WebServer {
    private Handler _handler;

    public WebServer(Handler handler) {_handler = handler;}

    public void handle(HttpRequest request) {_handler.handle(request);}
}
