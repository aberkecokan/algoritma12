
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class aplet10 extends Applet implements MouseMotionListener {

    int x, y;
    boolean farkli = false;

    public void init() {
        setSize(400, 400);
        addMouseMotionListener(this);//eklemessen hıc bısı calısmaz!!!
    }

    public void paint(Graphics g) {
        if (farkli) {

            g.setColor(Color.blue);
            g.drawString("Yasin Çakar", x, y);
        } else {
            g.setColor(Color.yellow);
            g.drawString("Bilgisayar Mühendisliği", x, y);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {//tıklayıp suruklersen
        farkli = false;
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {//suruklersen
        farkli = true;
        x = e.getX();
        y = e.getY();
        repaint();
    }

}
