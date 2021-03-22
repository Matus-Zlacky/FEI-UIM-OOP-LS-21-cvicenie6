package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);

        var panel = new JPanel();
        okno.add(panel);

        var panelLayout = new GridLayout(4, 4);
        panel.setLayout(panelLayout);

        var label = new JLabel("Hello world");
        panel.add(label);

        for (int i = 0; i < 12; i++) {
            panel.add(new JLabel("" + i));
        }
    }
}
