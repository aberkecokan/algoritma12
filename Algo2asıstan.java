//C:\Users\Yasin Doğan Çakar\Desktop\dosyalar
package algo2asıstan;

import java.io.File;
import java.io.PrintWriter;


public class Algo2asıstan {

    
    public static void main(String[] args) {
      File f=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\yazılar.txt");
        try {
            
             PrintWriter p=new PrintWriter(f);
             p.println("yasin");
             p.close();
           
        } catch (Exception e) {
        }
     
    }
    
}
