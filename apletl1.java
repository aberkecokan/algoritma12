
package apletalgo2lab;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class apletl1 extends Applet {
    public void init(){
        System.out.println("Hoşgeldin");
    }
    public void start(){
        System.out.println("Applet başlatıldı");
    }
    public void stop(){
        System.out.println("Applet durduruldu");
    }
    public void paint(Graphics g){
    g.drawString("Meraba Gençler", 60, 10);
    g.setColor(Color.MAGENTA);
    g.drawOval(100, 30, 60, 30);
    g.drawOval(100, 120, 60, 30);
    g.drawLine(100, 45, 100, 135);
    g.drawLine(160, 45, 160, 135);
    }
}
