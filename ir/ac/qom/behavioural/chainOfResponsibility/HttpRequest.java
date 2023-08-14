package ir.ac.qom.behavioural.chainOfResponsibility;

public class HttpRequest {
    private String _username;
    private String _password;

    public HttpRequest(String username, String password) {
        _username = username;
        _password = password;
    }

    public String getUsername() {return _username;}

    public String getPassword() {return _password;}
}
