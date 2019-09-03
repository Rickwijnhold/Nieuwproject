package h011;

import java.awt.*;
import java.applet.*;


public class Hoofdstuk119 extends Applet {
    int x;
    int y;
    int x2;
    int y2;
    int y3;
    int y4;
    int y5;
    int y6;
    int y7;
    int y8;

    public void init() {
        setSize(750,750);
        x = 20;
        y = 62;
        x2 = 62;
        y2 = 62;
        y3 = 104;
        y4 = 146;
        y5 = 188;
        y6 = 230;
        y7 = 272;
        y8 = 314;

    }

    public void paint(Graphics g) {

        for (int i = 1; i < 5 ; i++) {
            g.drawRect(x,20, 40, 40);
            g.fillRect(x2,20,40,40);
            g.fillRect(x,y2,40,40);
            g.drawRect(x2,y2,40,40);
            g.drawRect(x,y3, 40, 40);
            g.fillRect(x2,y3,40,40);
            g.fillRect(x,y4,40,40);
            g.drawRect(x2,y4,40,40);
            g.drawRect(x,y5, 40, 40);
            g.fillRect(x2,y5,40,40);
            g.fillRect(x,y6,40,40);
            g.drawRect(x2,y6,40,40);
            g.drawRect(x,y7, 40, 40);
            g.fillRect(x2,y7,40,40);
            g.fillRect(x,y8,40,40);
            g.drawRect(x2,y8,40,40);

            x = x +84;
            x2 = x2 + 84;
        }
    }
}