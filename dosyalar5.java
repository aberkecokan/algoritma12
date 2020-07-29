//satır sayısı satırdakı kelıme saysı karakter sayısı
package algo2lab;

import java.io.File;
import java.util.Scanner;


public class dosyalar5 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\öğrenci.txt");
              Scanner oku = null;
        try {
            if (!f.exists()) { System.out.println("dosya yok");
                
            }
            else{
                oku=new Scanner(f);
                int satirsay=1;
              while (oku.hasNext()){
              String satir=oku.nextLine();
                  System.out.println(satirsay+"nolu satırda karakter sayısı "+satir.length());
                  String []s=satir.split(" "); //bosluga kadar olan kısım
                  System.out.println(satirsay+"nolu satırdakı kelıme sayısı "+s.length);
                  satirsay++;
              }
                System.out.println("satır sayısı:"+satirsay);
                oku.close();
              }
        } catch (Exception e) {
        }
       
        
        
    }
}
