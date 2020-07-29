
package apletalgo2lab;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class applet7 extends Applet {
    public void paint(Graphics g){
    g.drawArc(20, 20, 80, 60, 0,120);
    g.setColor(Color.red);
    g.drawOval(50, 80, 90, 60);//x y genıslık(w) yukseklık (h)
    g.drawLine(50, 110, 140, 110);//x1 y1 x2 y2
    g.drawLine(95, 80 , 95,140 );//
        setBackground(Color.ORANGE);//ARKA PLAN
        g.setColor(Color.CYAN);
    g.fillOval(100, 100, 90, 90);
    g.drawRect(10,20, 40, 50);//x y genıslık yukseklık // fill yaparsan ıcı dolu olur 
    Polygon p=new Polygon();
    p.addPoint(80, 80);
    p.addPoint(40,120);
    p.addPoint(80, 160);
    p.addPoint(120, 120);
    p.addPoint(80, 80);
    g.setColor(Color.white);
   g.drawPolyline(p.xpoints, p.ypoints, 5);//kaç tane oldugunu yaz sonuna 5 gıbı
    }
}
