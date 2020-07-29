
package apletalgo2lab;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class applet5 extends Applet implements Runnable {
    int x,y;
    int yon=1;
    public void init(){
    x=0;
    y=0;
    setSize(200,200);
        setBackground(Color.WHITE);
        (new Thread(applet5.this)).start();
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            if (x>getWidth()-25) {
                yon=-1;
            }
            else if(x<1){
            yon=1;
            }
            x=x+yon*5;
            y=y+yon*5;
            repaint();
        }
    }
    public void paint(Graphics g){
        System.out.println(getWidth());
        g.setColor(Color.BLUE);
    g.fillOval(x, y, 25, 25);
    
    }
}
