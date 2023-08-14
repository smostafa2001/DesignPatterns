package ir.ac.qom.creational.prototype;

public class Circle implements Component {
    private int _radius;

    @Override
    public void render() {System.out.println("Rendering a circle");}

    @Override
    public Component clone() {
        Circle newCircle = new Circle();
        newCircle.setRadius(_radius);
        return newCircle;
    }

    public int getRadius() {return _radius;}

    public void setRadius(int radius) {_radius = radius;}
}
