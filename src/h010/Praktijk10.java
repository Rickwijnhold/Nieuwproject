package h010;


// Voorbeeld 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijk10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Cijfer");
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
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "1 = Zeer slecht";
                    break;
                case 2:
                    tekst = "2 = Slecht";
                    break;
                case 3:
                    tekst = "3 = Ruim onvoldoende";
                    break;
                case 4:
                    tekst = "4 = Onvoldoende";
                    break;
                case 5:
                    tekst = "5 = Matig";
                    break;
                case 6:
                    tekst = "6 = Voldoende";
                    break;
                case 7:
                    tekst = "7 = Ruim voldoende";
                    break;
                case 8:
                    tekst = "8 = Goed";
                    break;
                case 9:
                    tekst = "9 = Zeer goed";
                    break;
                case 10:
                    tekst = "10 = Uitstekend";
                    break;
                default:
                    tekst = "Je cijfer kan niet hoger dan tien of lager dan 1";
                    break;
            }
            repaint();
        }
    }
}