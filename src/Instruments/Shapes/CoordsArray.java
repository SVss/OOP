package Instruments.Shapes;

import java.io.Serializable;
import java.util.ArrayList;

class CoordsArray implements Serializable{
    private int[] xs, ys;
    private int size = 0;

    CoordsArray(ArrayList<Point> pointsList) {
        this.size = pointsList.size();

        this.xs = new int[size];
        this.ys = new int[size];

        Point p;
        for (int i = 0; i < size; ++i) {
            p = pointsList.get(i);
            xs[i] = p.getX();
            ys[i] = p.getY();
        }
    }

    public int[] getXs() {
        return xs;
    }

    public int[] getYs() {
        return ys;
    }

    public int size() {
        return size;
    }
}
