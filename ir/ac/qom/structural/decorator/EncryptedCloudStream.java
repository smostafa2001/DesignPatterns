package ir.ac.qom.structural.decorator;

public class EncryptedCloudStream implements Stream {
    private Stream _stream;

    public EncryptedCloudStream(Stream stream) {_stream = stream;}

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        _stream.write(encrypted);
    }

    private String encrypt(String data) {return "!@#$%(!@#*)(*!@#";}
}
