package h012;



import h08.Praktijk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Hoofdstuk123 extends Applet {
    TextField tekstjes[];
    Button knopje;
    String s,s1,s2,s3,s4;

    public void init() {
        setSize(500, 500);
        tekstjes = new TextField[5];
        for (int i = 0; i < tekstjes.length; i++) {
            tekstjes[i] = new TextField();
            add(tekstjes[i]);
        }
        knopje = new Button("Enter");
        add(knopje);
        s = "";
        s1 = "";
        s2 = "";
        s3 = "";
        s4 = "";
        tekstjes[0].addActionListener(new Vak0Listener());
        tekstjes[1].addActionListener(new Vak1Listener());
        tekstjes[2].addActionListener(new Vak2Listener());
        tekstjes[3].addActionListener(new Vak3Listener());
        tekstjes[4].addActionListener(new Vak4Listener());
        knopje.addActionListener(new KnopListener());
    }

    public void paint(Graphics g) {
        g.drawString("getal 1:" + s , 50, 60);
        g.drawString("getal 2:" + s1 , 50, 80);
        g.drawString("getal 3:" + s2 , 50, 100);
        g.drawString("getal 4:" + s3 , 50, 120);
        g.drawString("getal 5:" + s4 , 50, 140);
    }
    class Vak0Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstjes[0].getText();
            repaint();
        }
    }
    class Vak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstjes[1].getText();
            repaint();
        }
    }
    class Vak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = tekstjes[2].getText();
            repaint();
        }
    }
    class Vak3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s3 = tekstjes[3].getText();
            repaint();
        }
    }
    class Vak4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s4 = tekstjes[4].getText();
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstjes[0].getText();
            s1 = tekstjes[1].getText();
            s2 = tekstjes[2].getText();
            s3 = tekstjes[3].getText();
            s4 = tekstjes[4].getText();
            repaint();
        }
    }
}
