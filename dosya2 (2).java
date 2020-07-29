package dosya;

import java.util.*;
import java.io.*;

public class dosya2 {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\yaprak.txt");
        PrintWriter fw = new PrintWriter(f);
        for (int i = 0; i < 1000; i++) {
            fw.println(i);

        }
        fw.close();
        PrintWriter asal = new PrintWriter("C:\\Users\\Yasin Doğan Çakar\\Desktop\\asal.txt");
        PrintWriter bolum = new PrintWriter("C:\\Users\\Yasin Doğan Çakar\\Desktop\\3ebolum.txt");
        Scanner a = new Scanner(f);
        int t;
        for (int i = 0; i < 1000; i++) {
            t = a.nextInt();
            if (t % 3 == 0) {
                bolum.println(t);
                for (int j = 0; j < t; j++) {

                    if (t % j == 0) {

                    } else {
                        asal.println(t);
                    }
                }
            }

        }
        a.close();
        asal.close();
        bolum.close();
    }
}
