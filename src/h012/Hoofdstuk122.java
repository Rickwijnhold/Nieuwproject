package h012;



import java.awt.*;
import java.applet.*;
import java.util.*;

public class Hoofdstuk122 extends Applet {
    Button knops[];

    public void init() {
        setSize(500, 500);
        knops = new Button[26];
        for (int i = 0; i < knops.length; i++) {
            knops[i] = new Button();
           knops[i].setLabel("knop");
            add(knops[i]);
        }
    }

    public void paint(Graphics g) {

    }
}