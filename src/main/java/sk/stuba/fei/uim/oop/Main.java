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
        panel.setBackground(Color.BLUE);

        var panelLayout = new GridLayout(4, 4);
        panel.setLayout(panelLayout);

        var label = new JLabel("Hello world");
        panel.add(label);

        var panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());

        panel2.add(new JLabel("top"), BorderLayout.PAGE_START);
        panel2.add(new JLabel("bottom"), BorderLayout.PAGE_END);
        panel2.add(new JLabel("left"), BorderLayout.LINE_START);
        panel2.add(new JLabel("right"), BorderLayout.LINE_END);
        panel2.add(new JLabel("center"), BorderLayout.CENTER);

        for (int i = 0; i < 12; i++) {
            if (i == 8) {
                panel.add(panel2);
            } else {
                panel.add(new JLabel("" + i));
            }
        }
    }
}
