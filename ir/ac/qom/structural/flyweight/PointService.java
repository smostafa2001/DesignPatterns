package ir.ac.qom.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory _iconFactory;

    public PointService(PointIconFactory iconFactory) {_iconFactory = iconFactory;}

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(1, 2, _iconFactory.getPointIcon(PointType.CAFE));
        points.add(point);

        return points;
    }
}
