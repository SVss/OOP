import Instruments.DrawPanel;
import Instruments.InstrumentsPanel;

import java.awt.*;
import javax.swing.*;


public class MainWindow extends JFrame {
    private DrawPanel drawer = new DrawPanel();
    private JPanel instruments = new InstrumentsPanel(drawer);

    public MainWindow() {
        super("OOP - Savyonok Vladislav 451002");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());

        container.add(drawer, BorderLayout.CENTER);
        container.add(instruments, BorderLayout.SOUTH);

        this.pack();
    }

    public static void main(String[] args) {
        MainWindow app = new MainWindow();
        app.setVisible(true);
    }
}
