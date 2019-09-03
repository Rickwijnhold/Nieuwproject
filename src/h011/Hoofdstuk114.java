package h011;



import java.awt.*;
import java.applet.*;


public class Hoofdstuk114 extends Applet {
    int getal1;
    int getal2;
    int som;
    int x;
    int y;


    public void init() {
       getal1 = 1;
         getal2 = 3;
         som = getal1 * getal2;


    }


    public void paint(Graphics g) {
        for (int i = 1; i < 1000 ; i++) {
            g.drawString(""+som,x,y);
            x = x + 70;
            y = 50;
            getal1 = getal2;
            getal2 = som;
            som = getal1 * getal2;
        }
    }
}
