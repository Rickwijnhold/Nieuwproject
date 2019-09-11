package h012;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijk12 extends Applet {
    int telefoonnummers[];
    String naams[];
  TextField telefoon;
  TextField namen;
  Button knopje;
  String s;
    public void init() {
        namen = new TextField(20);
        telefoon = new TextField(20);
        knopje = new Button("ok");
        add(telefoon);
        add(namen);
        add(knopje);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("Vul hier een naam in",40,45);
        g.drawString("Vul hier een telefoon-nummer in",180,45);
    }
}