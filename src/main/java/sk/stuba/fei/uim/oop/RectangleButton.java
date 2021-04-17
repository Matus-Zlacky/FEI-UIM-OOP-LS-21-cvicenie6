package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleButton extends JButton implements ActionListener {
    public boolean wannaRect;

    public RectangleButton(String label){
        super(label);
        addActionListener(this);
        wannaRect = true;

    }

    public void actionPerformed(ActionEvent e){
        System.out.println("I wanna a stvorec");
        wannaRect = true;
    }
}
