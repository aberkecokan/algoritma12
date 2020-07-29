//dosyaya rasgele 10 tane sayı yazdıran program
package algo2defter;
import java.io.PrintWriter;
import java.io.File;


public class dosyalar {
    public static void main(String[] args) {
        File dosya=new File ("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\sayılar.txt");
        PrintWriter p=null;
        try {
            if (!dosya.exists()) { System.out.println("dosya oluşturuldu");
                dosya.createNewFile();
            }
            else {
                p=new PrintWriter(dosya);
                for (int i = 0; i < 10; i++) {
                    int sayi=(int)(Math.random()*100);
                    p.println(sayi);
                   
                }
                p.close();
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Hata oluştu:"+e.getMessage());
        }
      
        }
}
