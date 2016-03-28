package Instruments.Shapes;

import java.awt.*;

public class PolyLine extends PolyShape{
    public PolyLine() {
        super();
    }

    @Override
    public void draw(Graphics g) {
        CoordsArray coords = new CoordsArray(this.getPointsList() );
        g.drawPolyline(coords.getXs(), coords.getYs(), coords.size() );
    }
}
