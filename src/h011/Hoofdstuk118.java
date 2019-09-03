package h011;



import java.awt.*;
import java.applet.*;


public class Hoofdstuk118 extends Applet {
    int widt;
    int height;
    int x;
    int y;

    public void init() {
    setSize(1000,1000);
        widt = 10;
        height =10;
        x = 500;
        y =500;
    }


    public void paint(Graphics g) {

        for (int i = 1; i < 101 ; i++) {
            g.drawOval(x, y, widt, height);


            x = x-5;
            y=y-5;
            widt=widt+10;
            height=height+10;


        }
    }
}
