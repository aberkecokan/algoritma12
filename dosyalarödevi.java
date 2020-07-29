
package algo2defter;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class dosyalarödevi {
    public static void main(String[] args) {
        File dosya=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\öğrenciödev.txt");
        Scanner oku=null;
        PrintWriter p=null;
        try {
            if (!dosya.exists()) {System.out.println("dosya olusturuldu");
            dosya.createNewFile();
            }
            else{
                Scanner k=new Scanner(System.in);
                p=new PrintWriter(dosya);               
                 int v,f;//vize final
                    String adsoy;
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ad soyadı giriniz:");
                    adsoy=k.next();
                    System.out.println("Vize notunu giriniz:");
                    v=k.nextInt();
                    System.out.println("Final notunu giriniz:");
                    f=k.nextInt();
                    
                }
                p.close();
                oku=new Scanner(dosya);
               while(oku.hasNext()){
               String satir=oku.nextLine();
               String[]dizi=satir.split(" ");
                   for (int i = 2; i < 4; i++) {
                       double vizort=Integer.parseInt(dizi[2]);
                       vizort=(double)vizort/100*40;
                       double finort=Integer.parseInt(dizi[3]);
                       finort=(double)finort/100*60;
                       double ortalama=vizort+finort;
                       System.out.println(dizi[0]+dizi[1]+" ortalama:"+ortalama);
                   
                       
                   }
                   oku.close();
               }    
            }
        } catch (Exception e) {
        }
        
    }
}
