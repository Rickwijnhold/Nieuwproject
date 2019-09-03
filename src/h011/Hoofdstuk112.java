package h011;



import java.awt.*;
import java.applet.*;


public class Hoofdstuk112 extends Applet {
    int x;
    int y1;
    int yeah;


    public void init() {
        setSize(600, 800);
        x = 20;
        y1 = 50;
        yeah = 0;
    }


    public void paint(Graphics g) {

        for (int i = 9; i < 20; i++) {
            y1 += 1;
            g.drawString("Getallen: " + x, 50, y1);
            x = x - 1;
            y1 = y1 + 20;

        }
    }
}