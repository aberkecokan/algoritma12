
package algo2final;

import java.applet.Applet;
import java.awt.Graphics;
public class algo2fınal3 extends Applet{
    public void init(){
    setSize(600,600);
    }
    public void paint(Graphics g){
    g.drawLine(0, 300, 600, 300);
    g.drawLine(300, 0, 300, 600);
    double y1;
    double y2;
        for (int x = 0; x <6.28; x+=0.01) {
            y1=Math.sin(x);
            y2=Math.sin(x+0.01);
            g.drawLine(300+(int)(30*x),300-(int)(30*y1),300+(int)(30*(x+0.01)) ,300-(int)(30*y2));
        }
    }
    
}
