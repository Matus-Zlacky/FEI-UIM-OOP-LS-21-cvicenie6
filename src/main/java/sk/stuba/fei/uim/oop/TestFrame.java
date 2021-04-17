package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame implements ActionListener {
    private String close = "zavri";
    private String novinka = "new";
    public static int pocetFrameov = 0;
    public static int umiestnenie = 10;

    public TestFrame(){};

    public TestFrame(String nazov){
        super(nazov);
        setSize(300,300);

        JPanel p = new JPanel();
        JButton b = new JButton(close);
        JButton b2 = new JButton(novinka);
        b.addActionListener(this);
        b2.addActionListener(this);

        p.add(b);
        p.add(b2);
        add(p);

        setLocation(umiestnenie, umiestnenie);
        setVisible(true);
        pocetFrameov++;
        umiestnenie = umiestnenie + 50;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(close)){
            if (pocetFrameov == 1){
                System.exit(0);     //zavrie cely program, vratane vsetkych frameov
            }
            dispose();      //zavrie Frame
            pocetFrameov--;
        }

        if(e.getActionCommand().equals(novinka)){
            new TestFrame("moja appka");
        }
    }
}
