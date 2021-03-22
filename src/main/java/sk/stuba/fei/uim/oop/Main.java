package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private JPanel panel;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);

        this.panel = new JPanel();
        okno.add(panel);

        var button = new JButton("Click me!");

        panel.add(button);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
        this.panel.removeAll();
        this.panel.repaint();
    }
}
