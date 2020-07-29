//kendisine parametre olarak bir dosya değişkeni alan ve bu dosyaya yine parametre oalraak gırılen ad soyad ve notu bılgısını yazdıran java kodu
//gırılen dosyadakılerı okuyup sınıf ortalamasını alan kod
package algo2lab;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class dosyalar4 {

    public static void dosyayaz(File f, String adsoy, int not) {
        PrintWriter p = null;
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            p = new PrintWriter(new FileOutputStream(f, true));
            p.println(adsoy + " " + not);
            p.close();
        } catch (Exception e) {
        }

    }

    public static double ortalama(File f) {
        double top = 0, sayi = 0;
        try {
            Scanner d = new Scanner(f);
            while (d.hasNext()) {
                sayi++;
                String ad = d.next();
                String sayod = d.next();
                int notu = d.nextInt();
                top = top + notu;
            }

        } catch (Exception e) {
        }
        return top / sayi;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("ad soyad ve notu gir:");
        String adsoyad = k.nextLine();
        int notu = k.nextInt();
        File dosya = new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\öğrenci.txt");
        dosyayaz(dosya, adsoyad, notu);

        System.out.println("orlama:" + ortalama(dosya));
    }
}
