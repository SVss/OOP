package Instruments;

import Instruments.Shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private ArrayList<Instruments.Shapes.Shape> shapesList = new ArrayList<>();
    private MouseAdapter lastListener = null;
    private String currentShapeName = "";

    public DrawPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black) );
    }

    public void setCurrentShapeName(String name) {
        this.currentShapeName = name;
        repaint();
    }

    public void clearCurrentShapeName() {
        this.currentShapeName = "";
        repaint();
    }

    public void addShape(Shape shape) {
        this.shapesList.add(shape);
        repaint();
    }

    public void removeLastShape() {
        if (this.shapesList.size() > 0) {
            this.shapesList.remove(shapesList.size() - 1);
            repaint();
        }
    }

    public void replaceLastShape(Shape shape) {
        removeLastShape();
        addShape(shape);
    }

    public void clearShapes() {
        this.shapesList.clear();
        repaint();
    }

    public void setMouseListener(MouseAdapter mouseAdapter) {
        this.removeMouseListener(lastListener);
        this.removeMouseMotionListener(lastListener);

        this.addMouseListener(mouseAdapter);
        this.addMouseMotionListener(mouseAdapter);

        lastListener = mouseAdapter;
    }

    public Dimension getPreferredSize() {
        return new Dimension(600, 300);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        System.out.println("***");
        System.out.println(String.format("Instruments.DrawTools.Shapes count: %d", shapesList.size()) );
        System.out.println("Instruments.DrawTools.Shapes list:");

        g.drawString( (currentShapeName != "")?"Drawing: "+currentShapeName:"", 10, 20);

        int i = 0;
        for (Shape shape: shapesList) {
            shape.draw(g);

            System.out.println(String.format("%d) %s", ++i, shape.getClass().getSimpleName()));
        }
    }
}
