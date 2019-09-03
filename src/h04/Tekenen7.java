package h04;




import java.awt.*;
import java.applet.*;

public class Tekenen7 extends Applet {

    public void init() {
        setSize(800, 800);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.black);
        g.fillRect(100,100,500,500);

        g.setColor(Color.white);
        g.fillArc(150,150, 150, 150, 120, 360);
        g.fillArc(150,400, 150, 150, 120, 360);
        g.fillArc(400,150, 150, 150, 120, 360);
        g.fillArc(400,400, 150, 150, 120, 360);

    }
}