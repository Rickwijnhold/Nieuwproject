package h08;


//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knopopdracht2 extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int man;
    int vrouw;
    int meisje;
    int jongen;

    public void init() {
        knop1 = new Button("Man");
        knop2 = new Button("Vrouw");
        knop3 = new Button("Meisje");
        knop4 = new Button("Jongen");
        knop1.addActionListener( new Knop1Listener());
        knop2.addActionListener( new Knop2Listener());
        knop3.addActionListener(new Knop3Listener());
        knop4.addActionListener(new Knop4Listener());

        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
       man = 0;
       vrouw = 0;
       meisje = 0;
       jongen = 0;


    }

    public void paint(Graphics g) {
    g.drawString("Man: " + man,20,60);
        g.drawString("Vrouw:" + vrouw,20,80);
        g.drawString("Meisje:" + meisje,20,100);
        g.drawString("Jongen:"+ jongen,20,120);
    }
    class Knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongen = jongen + 1;
            repaint();
        }
    }
    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisje = meisje + 1;
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw = vrouw + 1;
            repaint();
        }
    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man = man + 1;
            repaint();
        }

    }
}