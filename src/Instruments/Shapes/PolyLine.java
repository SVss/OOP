package Instruments.Shapes;

import java.awt.*;
import java.io.Serializable;

public class PolyLine extends PolyShape  implements Serializable {
    public PolyLine() {
        super();
    }
    public PolyLine(Point p) {
        super(p);
    }

    @Override
    public void draw(Graphics g) {
        CoordsArray coords = new CoordsArray(this.getPointsList() );
        g.drawPolyline(coords.getXs(), coords.getYs(), coords.size() );
    }
}
