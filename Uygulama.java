
package algolab22kısım;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class uygulama extends JFrame {
    
    JButton b1,b2;
    JPanel p1;
    public uygulama(){
    b1=new JButton("OK");
    b2=new JButton("İPTAL");
    p1=new JPanel();
    t1=newJTextField(5);
    t1=newJTextField(5);
    p1.add(b1);
    p1.add(b2);
    add(p1);
    b1.addAncestorListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            int t1=Integer.parseInt(t1.getText());
                int t2=Integer.parseInt(t1.getText());
           JOptionPane.showMessageDialog(rootPane, "sonuc:"+(s1+s2));
        }
    });
    
    
    }
    public static void main(String[] args) {
        uygulama u=new uygulama();
        u.setTitle("ilk uygulama");
        u.setDefaultCloseOperation(EXIT_ON_CLOSE);
        u.setSize(200, 200);
        u.setVisible(true);
    }
}
