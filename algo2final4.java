
package algo2final;
import java.applet.Applet;
import java.awt.*;

public class algo2final4 extends Applet implements Runnable{
    int x,y;
    int yon=1;
    public void init(){
    x=0;
    y=0;
    setSize(400,400);
    (new Thread(algo2final4.this)).start();
    
    }
    public void run(){
    while(true){
        try {
            Thread.sleep(400);
        } catch (Exception e) {
        }
        if (x>getWidht()-25) {
            
        }
    }
    }
}
