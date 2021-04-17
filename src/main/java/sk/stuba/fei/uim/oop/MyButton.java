package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {
    private int pocet;

    public MyButton(String label){
        super(label);
        pocet = 0;

        addActionListener(this);        //nastavim to na seba
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        pocet++;
        System.out.println(e.getActionCommand()+ " "+pocet);
    }



}
