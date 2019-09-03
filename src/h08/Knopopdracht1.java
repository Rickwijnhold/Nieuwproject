//Voorbeeld 8.1
package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knopopdracht1 extends Applet {
    TextField tekstvak;
    Button confirmKnop;
    Button resetKnop;
    String s;


    public void init() {
        tekstvak = new TextField("", 30);
        confirmKnop = new Button("Confirm");
        resetKnop = new Button("Reset");
        confirmKnop.addActionListener(new confirmListener());
        resetKnop.addActionListener(new resetListener());
        tekstvak.addActionListener(new TekstvakListener());


        add(tekstvak);
        add(confirmKnop);
        add(resetKnop);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60);
    }


    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            s = tekstvak.getText();
        repaint();


        }
    }
    class confirmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();

//            tekstvak.setText(s);
            repaint();
        }
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}
