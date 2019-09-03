package h06;


//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Getallen2 extends Applet{
    int uur;
    int dag;
    int jaar;




    public void init() {
        uur = 3600;
        dag = uur * 24;
        jaar = dag * 365;

    }

    public void paint(Graphics g) {
        g.drawString("1 uur: " + uur + "S", 20,20);
        g.drawString("1 dag: " + dag + "S", 20,40);
        g.drawString("1 jaar: " + jaar + "S", 20,60);
    }
}


