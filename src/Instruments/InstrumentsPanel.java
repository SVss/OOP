package Instruments;

import Instruments.DrawTools.ShapeDrawTool;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pro.ddopson.ClassEnumerator;

import java.io.File;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class InstrumentsPanel extends JPanel {

    public InstrumentsPanel(final DrawPanel d) {

        JButton buttonUndo = new JButton("Undo");
        buttonUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.removeLastShape();
            }
        });

        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.clearShapes();
            }
        });

        JButton buttonSave = new JButton("Save");
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saving list");

                JFileChooser saveFile = new JFileChooser();
                if (saveFile.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    ShapesListSerializer.saveShapesList(d.getShapesList(), saveFile.getSelectedFile().getName() );
                }
            }
        });

        JButton buttonLoad = new JButton("Load");
        buttonLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Loading list");

                JFileChooser loadFile = new JFileChooser();
                if (loadFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    d.setShapesList(ShapesListSerializer.loadShapesList(loadFile.getSelectedFile().getName() ) );
                    d.repaint();
                }
            }
        });


        this.add(new JLabel("Instruments"));

        // get DrawTools list from package
        List<Class<?>> drawToolClassesList =
                ClassEnumerator.getClassesForPackage(ShapeDrawTool.class.getPackage() );

        // add drawing buttons to DrawPanel
        try {
            for (Class<?> DrawToolClass: drawToolClassesList) {

                // skip inner classes (f/ex, anonymous ActionListeners)
                if ((DrawToolClass.getName().contains("$") ) ) continue;

                // skip abstract classes (f/ex ShapeDrawTool)
                if (Modifier.isAbstract(DrawToolClass.getModifiers() ) ) continue;

                this.add( ( (ShapeDrawTool)DrawToolClass.getConstructor(DrawPanel.class).newInstance(d)).getButton() );
            }
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        this.add(new JSeparator(SwingConstants.VERTICAL) );

        this.add(buttonUndo);
        this.add(buttonClear);

        this.add(new JSeparator(SwingConstants.VERTICAL) );

        this.add(buttonSave);
        this.add(buttonLoad);
    }
}
