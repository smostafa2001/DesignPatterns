package ir.ac.qom.structural.flyweight;

public class PointIcon {
    private final PointType _type;
    private final byte[] _icon;

    public PointIcon(PointType type, byte[] icon) {
        _type = type;
        _icon = icon;
    }

    public PointType getType() {return _type;}
}
