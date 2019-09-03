package h011;



import java.awt.*;
import java.applet.*;


public class Hoofdstuk117 extends Applet {
    int widt;
    int height;
    int x;
    int y;

    public void init() {

        widt = 10;
        height =10;
        x = 100;
        y =100;
    }


    public void paint(Graphics g) {

        for (int i = 1; i < 51 ; i++) {
            g.drawOval(x, y, widt, height);


            x = x-5;
            y=y-5;
            widt=widt+10;
            height=height+10;


        }
    }
}
