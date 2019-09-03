package Challenge;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Challenge7 extends Applet {
TextField tekstvak;
Button plus;
Button min;
Button uitkomst;
int procent;
double totaal;
double getal;
String s;
double antwoord;
    public void init() {
        setSize(500,500);
tekstvak = new TextField(25);
plus = new Button("+");
min = new Button("-");
uitkomst = new Button("=");
add(tekstvak);
add(plus);
add(min);
add(uitkomst);
procent = 0;
s = "";
plus.addActionListener(new PlusknopjeListener());
min.addActionListener(new MinknopjeListener());
uitkomst.addActionListener(new UitkomstknopjeListener());

    }
    public void paint(Graphics g) {
    g.drawString("Rekening bedrag:",8,20);
    g.drawString("Percentage fooi:"+ procent+ "%",8,60);
        g.drawString("Fooi:"+"€"+antwoord,8,100);
        g.drawString("Totaal incl fooi:"+totaal,8,120);
    }
    class MinknopjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            procent -= 1;
            repaint();
        }
    }
    class PlusknopjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            procent +=1;
            repaint();
        }
    }
    class UitkomstknopjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s );
            antwoord = getal/100*procent;
            totaal = getal+antwoord;
            repaint();
        }
    }
}
