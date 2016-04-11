package Instruments.Shapes;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class PolyShape extends Shape implements Serializable {
    protected ArrayList<Point> pointsList;

    public PolyShape() {
        this.pointsList = new ArrayList<>();
    }

    public PolyShape(Point p) {
        this.pointsList = new ArrayList<>();
        this.pointsList.add(p);
    }


    public Point addPoint(Point p) {
        this.pointsList.add(p);
        return p;
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

    public int pointsCount() {
        return this.pointsList.size()-1;
    }
}
