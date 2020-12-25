package builtin;

import javax.swing.*;
import java.awt.*;

/*
https://www.javatpoint.com/Displaying-image-in-swing
 */
public class ImageViewer {

    public void view() {
        MyCanvas.display();

    }

    private static class MyCanvas extends Canvas {

        public static void display() {
            MyCanvas m = new MyCanvas();
            JFrame f = new JFrame();
            f.add(m);
            f.setSize(500, 500);
            f.setVisible(true);
        }

        public void paint(Graphics g) {

            Toolkit t = Toolkit.getDefaultToolkit();
            Image i = t.getImage("resources/p3.png");
            g.drawImage(i, 10, 10, this);

        }
    }
}
