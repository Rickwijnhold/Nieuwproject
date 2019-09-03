//Voorbeeld 8.1
package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knopopdracht3 extends Applet {
    TextField tekstvak;
    Button okKnop;
    String s;
    double uitkomst;
    double btw;


    public void init() {
        tekstvak = new TextField("", 30);
        okKnop = new Button("Ok");
        okKnop.addActionListener(new okListener());
        tekstvak.addActionListener(new TekstvakListener());


        add(tekstvak);
        add(okKnop);
        s = "";
        btw = 1.21;


    }

    public void paint(Graphics g) {
        g.drawString("het bedrag plus btw " +uitkomst, 50, 60);
    }


    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            uitkomst = Double.parseDouble( s )*btw;

//            tekstvak.setText(s);
            repaint();
        }
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            uitkomst = Double.parseDouble( s )*btw;

            repaint();
        }
    }
}