
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public  class applet11 extends Applet implements KeyListener {
int x,y;
public void init(){
x=0;
y=0;
    addKeyListener(this);
}
public void paint(Graphics g){
    g.setColor(Color.red);
g.fillOval(x, y, 20,20);
}
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar()=='a'&& x<getWidth()-20) {
            x+=5;
    }
        else if(e.getKeyChar()=='s'&& y<getWidth()-20){
        y+=5;
        
        }
        else if(e.getKeyCode()==KeyEvent.VK_W && y>0){
        y-=5;
        }
        else if(e.getKeyCode()==KeyEvent.VK_D && x>0){
        x-=5;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}
