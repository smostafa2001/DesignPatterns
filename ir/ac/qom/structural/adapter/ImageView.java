package ir.ac.qom.structural.adapter;

public class ImageView {
    private Image _image;

    public ImageView(Image image) {_image = image;}

    public void apply(Filter filter) {filter.apply(_image);}
}
