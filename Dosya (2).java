
package dosya;

import java.io.*;
import java.util.*;
public class Dosya {

   
    public static void main(String[] args)  throws Exception{
        File dosya =new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\yasin.txt");
       PrintWriter k=new PrintWriter(dosya);
        for (int i = 0; i < 100; i++) {
            k.println((int)(100*Math.random()));
            
        }
        k.close();
        
            PrintWriter tek=new  PrintWriter ("C:\\Users\\Yasin Doğan Çakar\\Desktop\\tek.txt") ;
            PrintWriter cift=new  PrintWriter ("C:\\Users\\Yasin Doğan Çakar\\Desktop\\cift.txt") ;
            Scanner s=new Scanner(dosya);
            int b;
            while (s.hasNextInt()){  
            b=s.nextInt();
            if (b%2==0) {
            cift.println(b);}
            else    {
            tek.println(b);}
        }s.close();
            tek.close();
            cift.close();
           
    }
    
    
}
