package h011;



import java.awt.*;
import java.applet.*;


public class Hoofdstuk115 extends Applet {
    int x;
    int y;


    public void init() {
    x = 10;
    y =20;
    }


    public void paint(Graphics g) {
        for (int i = 1; i < 6 ; i++) {
            g.drawRect(x,y,10,10);
            x = x+10;
            y= y+10;
        }
    }
}
