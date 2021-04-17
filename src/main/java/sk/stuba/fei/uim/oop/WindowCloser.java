package sk.stuba.fei.uim.oop;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloser extends WindowAdapter {       //zavrie okno stlacenim X vpravo hore

    public void windowClosing (WindowEvent e){
        System.exit(0);
    }
}
