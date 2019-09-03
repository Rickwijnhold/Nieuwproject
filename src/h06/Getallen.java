package h06;


//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Getallen extends Applet{
    int Jan, Ali, Jeannette, Rick;
    double uitkomst;
    double totaal;
   int kinderen;




    public void init() {
        kinderen = 4;
        totaal = 113;
        uitkomst = totaal / kinderen;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst van Jan=: " + uitkomst, 20,20);
        g.drawString("De uitkomst van Ali=: " + uitkomst, 20,40);
        g.drawString("De uitkomst van Jeannette=: " + uitkomst, 20,60);
        g.drawString("De uitkomst van Rick=: " + uitkomst, 20,80);
    }
}
