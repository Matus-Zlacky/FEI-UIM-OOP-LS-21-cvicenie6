package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;        //reagovat na eventy

public class Main {

    public static void main (String[] args) {
        JFrame f = new JFrame();
        f.add(new TestCanvasKey());
        f.setSize(300,300);
        f.setVisible(true);




        /*

        //MyFrame f = new MyFrame("stvorce");
        JFrame f = new JFrame();
        f.setSize(300,300);
        f.setVisible(true);
        f.addWindowListener(new WindowCloser()
                {
                    public void WindowClosing(){        //zavretie pomocou X na okne
                        System.exit(0);
                    }
                });


        new TestFrame("Moja appka");        //uzavretie/vytvorenie noveho frameu pomocou tlacidla


        var okno = new JFrame();
        okno.setSize(300, 300);

        JPanel p = new JPanel();
        MyButton b = new MyButton("OK");
            JButton b2 = new JButton("nie som actionListener"); //ked kliknem nestane sa nic
            b2.addActionListener(b);        //ked kliknem spravi to iste co tlacidlo 'b' len s inym vypisom

        p.add(b);
        p.add(b2);
        okno.add(p);



        JPanel p = new JPanel();                //zaciatok actionListener
        JButton b = new JButton("OK");
        b.addActionListener(new ButtonPrinter());

        p.add(b);
        okno.add(p);


        okno.setLayout(new BorderLayout());     //sever, juh, vychod, zapad
        okno.add("Center", new Canvas1());

        JPanel p = new JPanel();
        p.add(new JButton("change"));
        p.add(new JButton("closed"));

        okno.add("South", p);


        okno.setLayout(new GridLayout(0,2));    //pocet riadkov a stlpcov
        okno.add(new JLabel("ahoj"));
        okno.add(new JLabel("dovi"));
        okno.add(new JLabel("nazdar"));
        okno.pack();  //da to do najmensieho "pekneho" tvaru


        okno.setVisible(true);          //treba aby bolo vidno okno !

 */
    }


}
