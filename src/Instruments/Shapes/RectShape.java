package Instruments.Shapes;

public abstract class RectShape extends Shape {
    protected Point firstPoint;
    protected Point secondPoint;

    RectShape() {}

    RectShape(Point start, Point finish) {
        this.firstPoint = start;
        this.secondPoint = finish;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point point) {
        firstPoint = point;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point point) {
        secondPoint = point;
    }

    public int getHeight() {
        return firstPoint.getY() - secondPoint.getY();
    }

    public int getWidth() {
        return firstPoint.getX() - secondPoint.getX();
    }

}
