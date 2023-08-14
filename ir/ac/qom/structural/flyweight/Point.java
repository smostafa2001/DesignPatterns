package ir.ac.qom.structural.flyweight;

public class Point {
    private int _x;
    private int _y;
    private PointIcon _icon;

    public Point(int x, int y, PointIcon icon) {
        _x = x;
        _y = y;
        _icon = icon;
    }

    public void draw() {System.out.printf("%s at (%d, %d)", _icon.getType(),_x, _y);}
}
