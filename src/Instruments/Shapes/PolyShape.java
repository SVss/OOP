package Instruments.Shapes;

import java.util.ArrayList;

public abstract class PolyShape extends Shape {
    protected ArrayList<Point> pointsList = new ArrayList<>();

    public PolyShape() { }

    public void addPoint(Point p) {
        this.pointsList.add(p);
    }

    public void removeLastPoint() {
        int size = pointsList.size();
        if (size > 0) {
            pointsList.remove(size-1);
        }
    }

    public void replaceLastPoint(Point p) {
        removeLastPoint();
        addPoint(p);
    }

    protected ArrayList<Point> getPointsList() {
        return this.pointsList;
    }
}
