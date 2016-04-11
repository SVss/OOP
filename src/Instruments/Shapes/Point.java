package Instruments.Shapes;

import java.io.Serializable;

public class Point implements Serializable{
    private int x, y;

    public Point() {
        this.x = this.y = 0;
    }

    public Point(int x, int y) {
        setPoint(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
