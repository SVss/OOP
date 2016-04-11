package Instruments.Shapes;

import java.awt.*;
import java.io.Serializable;

public class Polygon extends PolyShape  implements Serializable {
    public Polygon() {
        super();
    }
    public Polygon(Point p) {
        super(p);
    }

    @Override
    public void draw(Graphics g) {
        CoordsArray coords = new CoordsArray(this.getPointsList() );
        g.drawPolygon(coords.getXs(), coords.getYs(), coords.size() );
    }
}
