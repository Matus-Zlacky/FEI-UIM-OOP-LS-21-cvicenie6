package sk.stuba.fei.uim.oop;

import java.awt.*;

public class Canvas1 extends Canvas {

    public void paint(Graphics g){
        Dimension d = getSize();
        int w = d.width;
        int h = d.height;
        g.drawString("hello", w/2,h/2);

        Color c = Color.RED;
        g.setColor(c);
        g.drawRect(5,5, w-15,h-15);

    }
}
