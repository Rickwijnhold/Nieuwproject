package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Tekenen5 extends Applet {

    public void init() {
        setSize(800,800);
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(40, 120, 700, 500, 120, 360);

    }
}
