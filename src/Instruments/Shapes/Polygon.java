package Instruments.Shapes;

import java.awt.*;

public class Polygon extends PolyShape{
    public Polygon() {
        super();
    }
    public Polygon(Point p) {
        super(p);
    }

    @Override
    public void draw(Graphics g) {
        CoordsArray coords = new CoordsArray(this.getPointsList() );
        g.drawPolyline(coords.getXs(), coords.getYs(), coords.size() );
    }
}
