package h011;

import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Hoofdstukelfpraktijk extends Applet {
TextField tekstvak;
Button knop;
String s;
int eerstegetal;
int antwoord1;
int x;
int y;

    public void init() {
tekstvak = new TextField(7);
knop = new Button("-.-");
knop.addActionListener(new KnopListener());
add(tekstvak);
add(knop);
s = "";
y=60;

    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s = tekstvak.getText();
            eerstegetal = Integer.parseInt( s );
            repaint();
        }
    }
    public void paint(Graphics g) {
        for (int i = 0; i <11 ; i++) {
            g.drawString( ""+ x , 50, 50+i*15);
            x = 0;
            x = eerstegetal*i;

        }

    }
}
