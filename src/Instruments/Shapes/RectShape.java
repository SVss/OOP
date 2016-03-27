package Instruments.Shapes;

public abstract class RectShape extends Shape {
    protected Point leftTop;
    protected Point rightBottom;

    RectShape() {}

    RectShape(Point start, Point finish) {
        this.leftTop = start;
        this.rightBottom = finish;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point point) {
        leftTop = point;
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point point) {
        rightBottom = point;
    }

    public int getHeight() {
        return leftTop.getY() - rightBottom.getY();
    }

    public int getWidth() {
        return leftTop.getX() - rightBottom.getX();
    }

}
