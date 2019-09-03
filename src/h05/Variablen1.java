package h05;

import java.applet.Applet;
import java.awt.*;

public class Variablen1 extends Applet {

    Color Valerie;
    Color Jeroen;
    Color Hans;

    int Twintig;
    int Veertig;
    int Zestig;
    int Achtig;
    int Honderd;
    int zero;



    public void init() {
        setSize(800,800);
        Valerie = Color.RED;
        Jeroen = Color.GREEN;
        Hans = Color.ORANGE;
        Twintig = 90;
        Veertig = 220;
        Zestig = 350;
        Achtig = 480;
        Honderd = 590;
        zero = 0;







    }

    public void paint(Graphics g) {
        g.drawLine(50,100,50,700);
        g.drawLine(50,700,650,700);
        g.drawString("100",35,720);
        g.drawString("80",35,593);
        g.drawString("60",35,463);
        g.drawString("40",35,333);
        g.drawString("20",35,203);
        g.drawString("0",25,110);
        g.drawString("Valerie",80,720);
        g.setColor(Valerie);
        g.fillRect(50,110,100, zero );
        g.setColor(Color.black);
        g.drawString("Jeroen",180,720);
        g.setColor(Jeroen);
        g.fillRect(150,110,100, Zestig);
        g.setColor(Color.black);
        g.drawString("Hans",280,720);
        g.setColor(Hans);
        g.fillRect(250,110,100, Veertig);
    }
}