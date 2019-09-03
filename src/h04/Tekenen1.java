package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Tekenen1 extends Applet {

    public void init() {
        setSize(800,800);
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 300, 270, 120);
        g.drawLine(50, 300, 50, 120);

    }
}
