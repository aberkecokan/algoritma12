
package dosya;
import java.util.*;
import java.io.*;
public class dosya1 {
    public static void main(String[] args) throws Exception{
        Scanner k=new Scanner(System.in);
        File a=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\isim.txt");
        PrintWriter b=new PrintWriter(a);
        for (int i = 0; i < 10; i++) {
            b.println(k.nextLine());
            
        }
        b.close();
        PrintWriter a1=new PrintWriter("C:\\Users\\Yasin Doğan Çakar\\Desktop\\kısa.txt");
        PrintWriter a2=new PrintWriter("C:\\Users\\Yasin Doğan Çakar\\Desktop\\uzun.txt");
        Scanner k1=new Scanner(a);
        String s;
        for (int i = 0; i < 10; i++) {
            
        
        s=k1.nextLine();
        
        if (s.length()>3) {
            a2.println(s);
            
        }
        else{
        a1.println(s);
        }}
         k1.close();
        a2.close();
        a1.close();
           
        
    }
}
