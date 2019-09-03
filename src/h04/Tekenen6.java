package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Tekenen6 extends Applet {

    public void init() {
        setSize(800,800);
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.black);
        g.fillArc(250, 130, 140, 220, 120, 360);
        g.setColor(Color.red);
        g.fillArc(295, 150, 50, 60, 120, 360);
        g.setColor(Color.orange);
        g.fillArc(295, 212, 50, 60, 120, 360);
        g.setColor(Color.green);
        g.fillArc(295, 275, 50, 60, 120, 360);
        g.setColor(Color.GRAY);
        g.fillRect(310, 350, 20, 200);

    }
}