package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashSet;
import java.util.Iterator;

public class TestCanvas extends Canvas implements MouseListener{
    public RectangleButton gombik;
    public HashSet<Rectangle> ourObjects = new HashSet<Rectangle>();

    public TestCanvas(RectangleButton gombik){
        super();
        addMouseListener(this);
        this.gombik = gombik;
    }
/*
    public void newObjects(){
        int i = 0;
        int j = 20;

        while (i < 5){
            ourObjects.add(new Rectangle(10, j,25,25));
            j = j+30;
            i++;
        }
    }
*/

    public void paint(Graphics g){
        //2.verzia toho isteho co je dole
        for (Rectangle actRectangle : ourObjects){
            g.drawRect(actRectangle.x, actRectangle.y, actRectangle.width, actRectangle.height);
        }


       /* Rectangle actRectangle;
        Iterator it = ourObjects.iterator();

        while( it.hasNext()){
            Object actual = it.next();
            if (actual instanceof Rectangle){
                actRectangle = (Rectangle) actual;
                g.drawRect(actRectangle.x, actRectangle.y, actRectangle.width, actRectangle.height);
            }
        }*/

    }


    //metody MouseListener
    public void mouseClicked(MouseEvent e){
        if (gombik.wannaRect) {
            ourObjects.add(new Rectangle(e.getX(), e.getY(), 25, 25));
            repaint();  //znova prekleslit plochu
            gombik.wannaRect = false;
        }
    }
    public void mousePressed(MouseEvent e){ }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e){ }
    public void mouseExited(MouseEvent e){ }
/*
    //metody mouseMotionListener
    public void	mouseMoved(MouseEvent e){
        System.out.println("hybem sa " + e.getX()+ ", "+ e.getY());
    }

    public void mouseDragged(MouseEvent e){
        System.out.println("stlacena sa hybem na " + e.getX()+ ", "+ e.getY());
    }

*/

}
