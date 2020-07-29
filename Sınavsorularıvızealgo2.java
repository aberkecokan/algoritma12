
package sınavsorularıvızealgo2;
import java.awt.Graphics;
public void init() {
setSize(800, 800);
}

public void paint(Graphics g) {
double x;
int x1, x2, y1, y2;
g.drawLine(0, 300, 800, 300);
g.drawLine(400, 0, 400, 800);
for (x = 0; x < 12.56; x += 0.01) {
x1 = 400 + (int) (30 * x);
y1 = 300 - (int) (30 * 5 * Math.sin(x));
x2 = 400 + (int) (30 * (x+0.1 ));
y2 = 300 - (int) (30 * 5 * Math.sin(x + 0.01));
g.drawLine(x1, y1, x2, y2);
}

}
