package Eigencodes;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefeningen extends Applet {
    String s,buikoefen,armoefen,borstoefen,s2,Ja,Nee;
    Button ja;
    Button nee;
    Button buik;
    Button armen;
    Button borst;
    Button reset;

    public void init() {
    setSize(600,400);
    reset = new Button("Reset");
   ja = new Button("Ja");
   nee = new Button("Nee");
   buik = new Button("Buik");
   armen = new Button("Armen");
   borst = new Button("borst");
    add(buik);
    add(armen);
    add(borst);
   add(ja);
   add(nee);
   add(reset);
   s = "";
   s2 = "";
   Ja = "Ja";
   Nee = "Nee";
   buikoefen = "100 sit-ups,";
   armoefen = "10 kilo elke arm 50x,";
   borstoefen = "100 push-ups 2x 50.";
   nee.addActionListener(new NeeListener());
   ja.addActionListener(new JaListener());
   buik.addActionListener(new BuikListener());
   armen.addActionListener(new ArmenListener());
   borst.addActionListener(new BorstListener());
        reset.addActionListener(new ResetListener());


    }
    public void paint(Graphics  g) {
    g.drawString("Oefeningen:" +s,50,150);
    g.drawString("Gehaald:"+ ""+ "" +s2,50,200);
    }
    class BuikListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = buikoefen;
            repaint();
        }
    }
    class ArmenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = buikoefen+armoefen;
repaint();
        }
    }
    class BorstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = buikoefen+armoefen+borstoefen;
repaint();
        }
    }
    class JaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = Ja;
repaint();
        }
    }
    class NeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = Nee;
repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = "";
            s = "";
            repaint();
        }
    }
}
