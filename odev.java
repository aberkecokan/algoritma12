package algo2defter;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileOutputStream;

public class odev {

    public static void main(String[] args) {
        File dosya = new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\öğrenciödev.txt");
        PrintWriter yaz = null;
        Scanner k = null;
        try {

            yaz = new PrintWriter(new FileOutputStream(dosya, true));
            k = new Scanner(System.in);

            System.out.println("adsoyad gırınız");
            String adsoy = k.nextLine();

            System.out.println("vize ve final notunu giriniz");
            int v = k.nextInt();
            int f = k.nextInt();
            yaz.println(adsoy + " " + v + " " + f);

            yaz.close();

        } catch (Exception e) {
        }

       

    }
}
