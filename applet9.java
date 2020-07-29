
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;

public class applet9 extends Applet implements Runnable {
    int a, b, say = 0;
    Polygon p;
    public void init() {
        setSize(300, 300);
        p = new Polygon();
        for (int i = -200; i <= 200; i += 2) {
            p.addPoint(i + 200, 200 - (int) (80 * Math.sin(i * Math.PI * 3 / 180)));
        }
        (new Thread(applet9.this)).start();
        for (int i = 0; i < p.npoints; i++) {
            System.out.print(p.xpoints[i] + "," + p.ypoints[i] + " ");
        }
    }
    public void paint(Graphics g) {
        g.drawLine(5, 5, 5, 300);
        g.drawLine(5, 200, 300, 200);
        g.drawOval(a - 10, b - 10, 20, 20);
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);

    }

    @Override
    public void run() {
        while (true) {
            a = p.xpoints[say];
            b = p.ypoints[say];
            say++;
             
            if (say == p.npoints) {
                say = 0;
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
           repaint();
        }
    }
}
