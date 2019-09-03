package h06;



import java.awt.*;
import java.applet.*;


public class Praktijkopdracht extends Applet {
    float cijfer1;
    float cijfer2;
    float cijfer3;
    float gemiddelde;
    int gemiddelde2;
    double gemiddelde3;
    public void init() {
    cijfer1 = (float) 5.9;
    cijfer2 = (float) 6.3;
    cijfer3 = (float) 6.9;
    gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
    gemiddelde2 = (int) gemiddelde * 10;
    gemiddelde3 = (double) gemiddelde2 / 10;
    }

    public void paint(Graphics g) {
 g.drawString("Cijfer 1: " + cijfer1, +20,20);
 g.drawString("Cijfer 2: " + cijfer2, +20,40);
 g.drawString("Cijfer 3: " + cijfer3, +20,60);
 g.drawString("Gemiddelde: " + gemiddelde, +20,80);
 g.drawString("Gemiddelde: " + gemiddelde2, +20,100);
 g.drawString("Gemiddelde: " + gemiddelde3, +20,120);

    }
}
