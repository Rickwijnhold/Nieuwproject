package h06;


//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Getallen3 extends Applet {
    int Max;
    int Bas;
    int uitkomst;
    public void init() {
        Max = 2147483647;
        Bas = 1;
        uitkomst = Max + Bas;

    }

    public void paint(Graphics g) {
        g.drawString("Maximum: " + uitkomst, 20,20);
    }
}