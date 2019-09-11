package h012;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk124 extends Applet {
    int getallen[] = {20, 30, 60, 80, 100};
    String s;
    Button knop;
    TextField tekst;


    public void init() {
        setSize(500, 500);
        tekst = new TextField(10);
        add(tekst);
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new KnopListener());
        s = "";
    }

    public void paint(Graphics g) {
       setBackground(Color.YELLOW);
        g.drawString("" + s, 200, 120);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekst.getText();
            int temp = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
    if (temp == getallen[i]) {
        s = "We hebben hem gevonden!";
        break;
    }
    else {
        s = "nope.";
    }
            }
            repaint();

        }
    }
}