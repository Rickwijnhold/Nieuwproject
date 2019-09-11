package h011;



import java.awt.*;
import java.applet.*;


public class Hoofdstuk113 extends Applet {
 int getal1;
 int getal2;
 int som;
 int x;
 int y;


    public void init() {
setSize(1000,1000);
    getal1 = 0;
    getal2 = 1;
    som = getal1 + getal2;

    }


    public void paint(Graphics g) {
        for (int i = 0; i < 1000 ; i++) {
            g.drawString(""+som,x,y);
     x = x + 20;
     y = 50;
     getal1 = getal2;
     getal2 = som;
     som = getal1 + getal2;
        }
        }
    }
