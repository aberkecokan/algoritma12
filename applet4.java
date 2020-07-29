
package apletalgo2lab;

import java.applet.Applet;
import java.awt.Graphics;


public class applet4 extends Applet {
    int width,height;
    public void init(){
    width=getSize().width;
    height=getSize().height;
    }
    public void paint(Graphics g){
    g.drawRect(20, 20, 100, 50);
    g.drawOval(20, 20, 50, 50);
    g.drawOval(70, 20, 50, 50);
    g.drawRect(100, 100, 50, 50);
    g.drawOval(100, 100, 50, 50);
    g.drawOval(118, 118, 15, 15);
    }
}
