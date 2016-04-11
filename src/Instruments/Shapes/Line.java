package Instruments.Shapes;

import java.awt.*;
import java.io.Serializable;

public class Line extends RectShape  implements Serializable {

    public Line(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY());
    }
}
