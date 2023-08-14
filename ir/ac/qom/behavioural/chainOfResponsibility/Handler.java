package ir.ac.qom.behavioural.chainOfResponsibility;

public abstract class Handler {
    private Handler _next;

    public Handler(Handler next) {_next = next;}

    public void handle(HttpRequest request) {
        if (doHandle(request)) return;
        if (_next != null) _next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}
