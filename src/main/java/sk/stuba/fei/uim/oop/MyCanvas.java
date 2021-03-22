package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas {




    @Override
    public void paint(Graphics g) {
        var image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        var ramGraphics = image.getGraphics();

        ramGraphics.setColor(Color.BLUE);
        ramGraphics.fillRect(100, 150, 100, 100);

        ramGraphics.setColor(Color.RED);
        ramGraphics.fillPolygon(new int[] {100, 200, 150}, new int[] {150, 150, 50}, 3);

        ramGraphics.setColor(Color.CYAN);
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                ramGraphics.fillRect(110 + 45 * x, 160 + 45 * y, 35, 35);
            }
        }

        g.drawImage(image, 0, 0, null);
    }
}
