
package apletalgo2lab;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class applet6 extends Applet implements Runnable {
      int x=100,y;
    int yon=1;
    public void init(){
    x=0;
    y=0;
    setSize(200,200);
        setBackground(Color.WHITE);
        (new Thread(applet6.this)).start();
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
            x=x;
            y=y+yon*25;
            repaint();
        }
    }
    public void paint(Graphics g){
        System.out.println(getWidth());
        g.setColor(Color.BLUE);
        for (int i = 0; i < y; i++) {
 g.drawOval(100, y, 25, 25);}
    }

}
