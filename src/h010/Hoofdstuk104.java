package h010;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk104 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst,februari;
    int jaartal;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        februari = "";
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(februari, 50, 80 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + "is een schikkeljaar";
                februari = "februari heeft 29 dagen";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
                februari = "februari heeft 28 dagen";
            }
            repaint();
        }
    }
}
