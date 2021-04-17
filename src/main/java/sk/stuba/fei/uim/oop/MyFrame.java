package sk.stuba.fei.uim.oop;

import javax.swing.*;

public class MyFrame extends JFrame {

    MyFrame (String nazov){
        super(nazov);
        JPanel p = new JPanel();
        RectangleButton gombik = new RectangleButton("stvorec");
        p.add(gombik);
        add("North", p);
        TestCanvas can = new TestCanvas(gombik);
        add("Center", can);
        setSize(300,300);
        setVisible(true);
    }
}
