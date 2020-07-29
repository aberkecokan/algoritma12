//dosyada yazan
//ali,4,6,8,3,1
//mehmet,7,5,3,2
//sema,5,3,3,6,7 gibi 
package algo2lab;

import java.io.File;
import java.util.Scanner;

public class dosyalar6 {
    public static void main(String[] args) {
        Scanner oku=null;
        File dosya=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\borc.txt");
        try {
            if (!dosya.exists()) {
                System.out.println("dosya mevcut değil");
            }
            oku=new Scanner(dosya);
            while   (oku.hasNext()){
            String satir=oku.nextLine();
            String[]dizi=satir.split(",");
            int borc=0;
                for (int i = 1; i < dizi.length; i++) {
                    int sayi=Integer.parseInt(dizi[i]);
                    borc+=sayi;
                }
                System.out.println(dizi[0]+" isimli kişinin borcu:"+borc);
            
            }
            oku.close();
        } catch (Exception e) {
        }
    }
  
}
