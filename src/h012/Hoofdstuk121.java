package h012;



import java.awt.*;
import java.applet.*;
import java.util.*;

public class Hoofdstuk121 extends Applet {
    int getallen[];
    int optelsom;
    int totaal;


    public void init() {
        getallen = new int[10];
        getallen[0] = 100;
        getallen[1] = 200;
        getallen[2] = 300;
        getallen[3] = 400;
        getallen[4] = 500;
        getallen[5] = 600;
        getallen[6] = 700;
        getallen[7] = 800;
        getallen[8] = 900;
        getallen[9] = 1000;
        totaal = getallen[0] + getallen[1] + getallen[2] + getallen[3] + getallen[4] + getallen[5] + getallen[6] + getallen[7] + getallen[8] + getallen[9];
        for (int teller = 0; teller < getallen.length; teller ++) {
            getallen[teller] = 100 * teller + 100;
optelsom = totaal/10;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller ++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);
            g.drawString("gemiddelde:" +optelsom, 50, 220);
        }
    }
}