//Voorbeeld 8.1
package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijk8 extends Applet {
    Button keer;
    Button deel;
    Button plus;
    Button min;
    TextField vak1;
    TextField vak2;
    String s;
    double eerstegetal;
    double tweedegetal;
    double antwoord;



    public void init() {
        vak1 = new TextField("" ,10);
        vak2 = new TextField("",10);
        vak1.addActionListener(new Vak1Listener());
        vak2.addActionListener(new Vak2Listener());
        keer = new Button("*");
        deel = new Button("/");
        plus = new Button("+");
        min = new Button("-");
        keer.addActionListener(new KeerListener());
        deel.addActionListener(new DeelListener());
        plus.addActionListener(new PlusListener());
        min.addActionListener(new MinListener());
        add(vak1);
        add(vak2);
    add(keer);
    add(deel);
    add(plus);
    add(min);
    s = "";


}

    public void paint(Graphics g) {
        g.drawString("Het antwoord " + antwoord , 50, 60);
    }
    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = vak1.getText();
            eerstegetal = Double.parseDouble( s );
            s = vak2.getText();
            tweedegetal = Double.parseDouble( s );
            antwoord = eerstegetal-tweedegetal;
            repaint();
        }
    }
    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = vak1.getText();
            eerstegetal = Double.parseDouble( s );
            s = vak2.getText();
            tweedegetal = Double.parseDouble( s );
            antwoord = eerstegetal+tweedegetal;
            repaint();
        }
    }
    class DeelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = vak1.getText();
            eerstegetal = Double.parseDouble( s );
            s = vak2.getText();
            tweedegetal = Double.parseDouble( s );
            antwoord = eerstegetal/tweedegetal;
            repaint();
        }
    }
    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
             s = vak1.getText();
            eerstegetal = Double.parseDouble( s );
            s = vak2.getText();
            tweedegetal = Double.parseDouble( s );
            antwoord = eerstegetal*tweedegetal;
            repaint();
        }
    }
    class Vak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            eerstegetal = Double.parseDouble( s );
            repaint();
        }
    }
    class Vak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tweedegetal = Double.parseDouble( s );
            repaint();
        }
    }
}
