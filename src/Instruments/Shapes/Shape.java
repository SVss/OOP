package Instruments.Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Shape implements Serializable{
    protected Color borderColor = Color.black;

    public abstract void draw(Graphics g);
}
