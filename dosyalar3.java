//dosya silme işlemi
package algo2lab;
import java.io.File;
import java.util.Scanner;


public class dosyalar3 {
    public static void main(String[] args) {
       
        File d=null;
        try {
        for (int i = 0; i <= 4; i++) {
            
        
    d=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\"+i+".txt");
       
  d.createNewFile();}
                System.out.println("Silinicek dosya ismi gir");
                Scanner k = new Scanner(System.in);
                String s=k.next();
                File silinicek=new File(s);
                if (!silinicek.exists()) {
                    System.out.println(silinicek.getName()+" isimli dosya silindi ");
                silinicek.delete();
                
            }
                else System.out.println("Dosya mevcut değil");
                
                
                File klasor=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar");
                File []dosyalar=klasor.listFiles();
                for (int i = 0; i <dosyalar.length; i++) {
                    if (dosyalar[i].isFile()) {
                        System.out.println(dosyalar[i].getName());
                    }
            }
            
        } catch (Exception e) {
        }
}}

    
 

