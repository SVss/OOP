package Instruments.Shapes;

import java.awt.*;
import java.io.Serializable;

public class Circle extends Rectangle implements Serializable{

    public Circle(Point start, Point finish) {
        super(start, finish);
    }

    public void draw(Graphics g) {
        int x1 = firstPoint.getX();
        int y1 = firstPoint.getY();

        int x2 = secondPoint.getX();
        int y2 = secondPoint.getY();

        int r = Math.round((int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));

        g.drawOval(x1-r, y1-r, 2*r, 2*r);
    }
}
