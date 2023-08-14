package ir.ac.qom.structural.decorator;

public class CompressedCloudStream implements Stream {
    private Stream _stream;

    public CompressedCloudStream(Stream stream) {_stream = stream;}

    @Override
    public void write(String data) {
        var compressed = compress(data);
        _stream.write(data);
    }

    private String compress(String data) {return data.substring(0, 5);}
}
