//ilk dosyada sayılar ve kelımeler var ayırın bunları .
package dosya;

import java.util.*;
import java.io.*;

public class dosya3 {

    public static void main(String[] args) throws IOException {
        File a = new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\yaprak.txt");
        PrintWriter sayi = new PrintWriter("C:\\Users\\Yasin Doğan Çakar\\Desktop\\sayi.txt");
        PrintWriter kelime = new PrintWriter("C:\\Users\\Yasin Doğan Çakar\\Desktop\\kelime.txt");
        Scanner oku = new Scanner(a);
        String k;
        while (oku.hasNext()) {
            k = oku.next();
            
                
            
            if (k.charAt(0)=='a') {
                kelime.println();

            } else {
                sayi.println();
            }
        }
        sayi.close();
        kelime.close();
        oku.close();
    }
}
