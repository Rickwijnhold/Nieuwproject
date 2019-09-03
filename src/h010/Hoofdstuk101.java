package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk101 extends Applet {

    TextField start;
    String s,text,omgekeerd;
    int getal1,getal2, getalo, getalk;

    public void init() {
        start = new TextField("",20);
        start.addActionListener(new startListener());
        getal1 = -100000;
        add(start);
        getalo = 100000;
    }

    class startListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            s = start.getText();
            getal2 = Integer.parseInt(s);
            text = String.valueOf(getal1);
            repaint();
            if (getal1 < getal2) {
                text = String.valueOf(getal2);
                getal1 = getal2;
            } else {
                text = String.valueOf(getal1);
            }
            s = start.getText();
            getalk= Integer.parseInt(s);
            if (getalo > getalk) {
                omgekeerd = String.valueOf(getalk);
                getalo = getalk;
            } else {
                omgekeerd = String.valueOf(getalo);
            }
            repaint();
        }

    }



    public void paint(Graphics g) {
        g.drawString(text +" is het hoogste getal",20,60);
        g.drawString(omgekeerd+ " is het laagste getal",20,80);
    }

}