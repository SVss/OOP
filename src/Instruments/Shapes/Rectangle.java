package Instruments.Shapes;

import java.awt.*;
import java.io.Serializable;

public class Rectangle extends RectShape  implements Serializable {

    public Rectangle(Point start, Point finish) {
        super(start, finish);
    }

    public void draw(Graphics g) {
        int x1 = firstPoint.getX();
        int x2 = secondPoint.getX();
        int y1 = firstPoint.getY();
        int y2 = secondPoint.getY();

        if (getHeight() == 0 || getWidth() == 0) {
            g.drawLine(x1, y1, x2, y2 );
        } else {
            g.drawLine(x1, y1, x2, y1);
            g.drawLine(x2, y1, x2, y2);
            g.drawLine(x2, y2, x1, y2);
            g.drawLine(x1, y2, x1, y1);
        }
    }
}
