package h010;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Maanden");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "Januari " + "-" + " 31 Dagen";
                    break;
                case 2:
                    tekst = "Februari " + "-" + "28/29 Dagen";
                    break;
                case 3:
                    tekst = "Maart " + "-" + " 31 Dagen";
                    break;
                case 4:
                    tekst = "April " + "-" + " 31 Dagen";
                    break;
                case 5:
                    tekst = "Mei " + "-" + " 31 Dagen";
                    break;
                case 6:
                    tekst = "Juni " + "-" + " 30 Dagen";

                    break;
                case 7:
                    tekst = "Juli " + "-" + " 31 Dagen";
                    break;
                case 8:
                    tekst = "Augustus " + "-" + " 31 Dagen";
                    break;
                case 9:
                    tekst = "September " + "-" + " 30 Dagen";
                    break;
                case 10:
                    tekst = "Oktober " + "-" + " 31 Dagen";
                    break;
                case 11:
                    tekst = "November " + "-" + "30 Dagen";
                    break;
                case 12:
                    tekst = "December " + "-" + " 31 Dagen";
                    break;
                default:
                    tekst = "Deze maand bestaat niet.";
                    break;
            }
            repaint();
        }
    }
}