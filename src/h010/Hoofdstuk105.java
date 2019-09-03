package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;

public class Hoofdstuk105 extends Applet {

    TextField text;
    Button add;
    Label onvoldoende;
    Label gemiddelde;
    Label Fout;
    double cijfer, totaalcijfer, gemmidelde;
    int i;
    String s;


    public void init() {
        setSize(1000,800);
        text = new TextField("", 20);
        add = new Button("bereken");
        onvoldoende = new Label("");
        gemiddelde = new Label("");
        Fout = new Label("");
        //-----------------------------------------
        add(text);
        add(add);
        add(onvoldoende);
        add(gemiddelde);
        add(Fout);
        //-----------------------------------------
        add.addActionListener(new addListener());
    }

    public class addListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            i++;
            s = text.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer >= 5.5) {
                onvoldoende.setText("voldoende");
                repaint();
            } else {
                onvoldoende.setText("onvoldoende");
                repaint();
            }
            if (cijfer >= 10) {
                Fout.setText("Het cijfer mag niet hoger zijn dan 10");
            } else {
                    Fout.setText("");
                }
            totaalcijfer += cijfer;
            gemmidelde = totaalcijfer / i;
            gemiddelde.setText(String.valueOf(gemmidelde));
            repaint();
            }
        }
    }

