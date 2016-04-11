package Instruments.Shapes;

import java.awt.Graphics;
import java.io.Serializable;

public class Ellipse extends RectShape  implements Serializable {

    public Ellipse(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public void draw(Graphics g) {
        int x1 = firstPoint.getX();
        int x2 = secondPoint.getX();
        int y1 = firstPoint.getY();
        int y2 = secondPoint.getY();

        if (getHeight() == 0 || getWidth() == 0) {
            g.drawLine(x1, y1, x2, y2 );
        } else {
            int ltX = 0, ltY = 0;
            int rbX = 0, rbY = 0;

            if (x1 < x2) {
                ltX = x1;
                rbX = x2;
            } else {
                ltX = x2;
                rbX = x1;
            }

            if (y1 < y2) {
                ltY = y1;
                rbY = y2;
            } else {
                ltY = y2;
                rbY = y1;
            }

            int realWidth = rbX - ltX;
            int realHeight = rbY - ltY;

            g.drawOval(ltX, ltY, realWidth, realHeight);
        }
    }
}
