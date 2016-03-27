package Instruments.Shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    protected Color borderColor = Color.black;

    public abstract void draw(Graphics g);
}
