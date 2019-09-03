package Challenge;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Challenge5 extends Applet {
    TextField valerie;
    TextField jeroen;
    TextField hans;
    Button knop;
    Color ValerieK;
    Color JeroenK;
    Color HansK;
    int ValerieY;
    int ValerieH;
    int JeroenY;
    int JeroenH;
    int HansY;
    int HansH;
    String V;
    String J;
    String H;
    public void init() {
        setSize(800,800);
        ValerieK = Color.RED;
        JeroenK = Color.BLUE;
        HansK = Color.YELLOW;
        V = "";
        J = "";
        H = "";
        valerie = new TextField("",15);
        jeroen = new TextField("",15);
        hans = new TextField("",15);
        knop = new Button("Toon");
        add(valerie);
        add(jeroen);
        add(hans);
        add(knop);
        knop.addActionListener(new ToonListener());
        ValerieY =500;
        ValerieH = 700-ValerieY;
        JeroenY = 500;
        JeroenH = 700-JeroenY;
        HansY = 500;
        HansH = 700-HansY;

    }
    public void paint(Graphics  g) {
        setSize(500,750);
        setBackground(Color.gray);
        g.drawLine(50,500,50,700);
        g.drawLine(50,700,300,700);
        g.drawString("0",35,720);
        g.drawString("20",35,680);
        g.drawString("40",35,660);
        g.drawString("60",35,645);
        g.drawString("80",35,623);
        g.drawString("100",25,605);
        g.drawString("Valerie",55,720);
        g.drawString("Valerie",65,50);
        g.drawString("Jeroen",200,50);
        g.drawString("Hans",350,50);
        g.setColor(ValerieK);
        g.fillRect(52,ValerieY,50, ValerieH );
        g.setColor(Color.black);
        g.drawString("Jeroen",140,720);
        g.setColor(JeroenK);
        g.fillRect(130,JeroenY,50, JeroenH);
        g.setColor(Color.black);
        g.drawString("Hans",220,720);
        g.setColor(HansK);
        g.fillRect(210,HansY,50, HansH);
    }
    class ToonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            V = valerie.getText();
            ValerieH = Integer.parseInt(V);
            ValerieH += 0;
            ValerieY = 700 - ValerieH;

            J = jeroen.getText();
            JeroenH = Integer.parseInt(J);
            JeroenH += 0;
            JeroenY = 700 - JeroenH;

            H = hans.getText();
            HansH = Integer.parseInt(H);
            HansH += 0;
            HansY = 700 - HansH;

            repaint();

        }
    }
}