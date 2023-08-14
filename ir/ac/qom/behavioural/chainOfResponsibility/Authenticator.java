package ir.ac.qom.behavioural.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {super(next);}

    @Override
    public boolean doHandle(HttpRequest request) {
        var validUsername = request.getUsername() == "admin";
        var validPassword = request.getPassword() == "1234";
        System.out.println("Authentication");
        return !(validUsername && validPassword);
    }
}
