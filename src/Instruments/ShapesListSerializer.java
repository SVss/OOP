package Instruments;

import Instruments.Shapes.Shape;

import java.io.*;
import java.util.ArrayList;

public class ShapesListSerializer {
    public static void saveShapesList(final ArrayList<Shape> shapesList, String fileName) {
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(shapesList);
            out.close();
            fileOut.close();
            System.out.printf("ShapesList is saved in ".concat(fileName));
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

    public static ArrayList<Shape> loadShapesList(String fileName) {
        ArrayList<Shape> shapesList;
        try
        {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            shapesList = (ArrayList<Shape>) in.readObject();
            in.close();
            fileIn.close();
            System.out.printf("ShapesList is loaded from ".concat(fileName));
        }catch(IOException i)
        {
            i.printStackTrace();
            return new ArrayList<Shape>();
        }catch(ClassNotFoundException c)
        {
            System.out.println("ShapesList not found");
            c.printStackTrace();
            return new ArrayList<Shape>();
        }
        return shapesList;
    }
}
