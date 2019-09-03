
package h04;

//Voorbeeld 4.3

import java.awt.*;
import java.applet.*;

public class Tekenen3 extends Applet {

    public void init() {
        setSize(800,800);
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.setColor(Color.red);

        g.fillRect(100, 53, 250, 80);

        g.setColor(Color.WHITE);
        g.fillRect(100, 134, 250, 80);

        g.setColor(Color.BLUE);
        g.fillRect(100, 214, 250, 80);

        g.setColor(Color.black);
        g.fillRect(95, 53, 5, 500);



    }
}
