package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Challenge6 extends Applet {
    Button Fris;
    Button Bier;
    Button Wijn;
    Button Koffie;
    Button Binnen;
    Button Buiten;
    Button Nieuw;
    String s;
    double totaal;
    double dagomzet;
    double Friss;
    double Bierr;
    double Wijnn;
    double Koffiee;
    double Buitenn;
    double Binnenn;

    public void init() {
        Friss = 2.2;
        Bierr = 2.50;
        Wijnn = 2.75;
        Koffiee = 2;
        Buitenn = 3.75;
        Binnenn = 3;
        dagomzet=0;
        Fris = new Button("Fris");
        Bier = new Button("Bier");
        Wijn = new Button("Wijn");
        Koffie = new Button("Koffie");
        Binnen = new Button("Binn gedist.");
        Buiten = new Button("Buit. gedist.");
        Nieuw = new Button("Nieuwe bestelling");
        add(Fris);
        add(Bier);
        add(Wijn);
        add(Koffie);
        add(Binnen);
        add(Buiten);
        add(Nieuw);
        Fris.addActionListener(new FrisknopListener());
        Bier.addActionListener(new BierknopListener());
        Koffie.addActionListener(new KoffieknopListener());
        Wijn.addActionListener(new WijnknopListener());
        Nieuw.addActionListener(new NieuweknopListener());
        Binnen.addActionListener(new  BinnenknopListener());
        Buiten.addActionListener(new BuitenknopListener());


    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.drawString("Bestelling totaal:" + totaal, 40, 100);
        g.drawString("Totaal dagomzet:" + dagomzet, 40, 120);
    }
    class WijnknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
    totaal = totaal + Wijnn;
    dagomzet = dagomzet + Wijnn;
    repaint();
        }
    }
    class FrisknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        totaal = totaal + Friss;
        dagomzet = dagomzet + Friss;
        repaint();
        }
    }
    class BierknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal = totaal + Bierr;
            dagomzet = dagomzet + Bierr ;
            repaint();
        }
    }

    class KoffieknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal = totaal+Koffiee;
           dagomzet= dagomzet+Koffiee;
            repaint();
        }
    }

    class BinnenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal= totaal+ Binnenn;
            dagomzet=dagomzet+Binnenn;
            repaint();
        }
    }

    class BuitenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal= totaal+ Buitenn;
            dagomzet=dagomzet+Buitenn;
            repaint();
        }
    }

    class NieuweknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal= 0;
            dagomzet = dagomzet + 0;
            repaint();
        }
    }
}