package h012;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Hoofdstuk126 extends Applet {
    int getallen[] = {1,1,1,1,1};
TextField tekstvak;
String s;
    public void init() {
       tekstvak =  new TextField(20);
       add(tekstvak);
       tekstvak.addActionListener(new tekstvakListener());
       s = "";
    }

    public void paint(Graphics g) {
g.drawString( "" +s,100,120);

    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          s = tekstvak.getText();
            int temp = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
                if (temp == getallen[i]) {
                    s = ""+getallen.length;
                    break;
                }
                else {
                    s = "Hij zit er niet in";
                }
            }
            repaint();

        }
        }
    }