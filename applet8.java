
package apletalgo2lab;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;


public class applet8 extends Applet {
    public void init(){
setSize(300,300);
}
    public void paint(Graphics g){
    g.drawLine(5, 5, 5, 300);
    g.drawLine(5, 200, 300, 200);
    Polygon p=new Polygon();
    double y=0;
        for (int i =-200; i <=100 ; i+=25) {
            p.addPoint(i+200, i-(int)(10*y*y));
            y=y+0.5;
        }
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }
}
