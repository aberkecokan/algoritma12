
package algo2defter;

import java.io.File;
import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {
        File dosya = new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\öğrenciödev.txt");
         try {
            Scanner oku = new Scanner(dosya);
            while (oku.hasNext()) {
                String satir=oku.nextLine();
            String[]dizi=satir.split(" ");
            double sonuc=0;
                 for (int i = 1; i < dizi.length; i++) {
                    int sayi=Integer.parseInt(dizi[i]);
                    int vnotu = oku.nextInt();
                int fnotu = oku.nextInt();
                    double vgelcek=(double)(vnotu/100)*40;
                double fgelcek=(double)(fnotu/100)*60;
                sonuc=vgelcek+fgelcek;
                }
               oku.close();
                
                System.out.println(sonuc);

            }
        } catch (Exception e) {
        }
    }
}
