package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestCanvasKey extends Canvas implements KeyListener {

    public TestCanvasKey(){
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.isActionKey()){
            System.out.println("keyPressed zavolane = Action key je "+ e.getKeyCode());
        }
        else{
            System.out.println("keyPressed zavolane = Something other je "+ e.getKeyCode());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased zavolane = Realeased code je "+ e.getKeyCode());
        System.out.println("-------------");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped zavolane = Character je "+ e.getKeyChar());
    }

}

