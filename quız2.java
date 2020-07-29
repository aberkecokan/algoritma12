//bir matrıstekı veriler aynı sekılde dosyaya yazdıran program
package algo2defter;

import java.io.File;
import java.io.PrintWriter;

public class quız2 {

    public static void main(String[] args) {
        int[][] matris = {{2, 4, 7}, {5, 6, 1}, {4, 6, 2}};
        File dosya = new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\quiz.txt");
        PrintWriter yaz = null;
        try {

            yaz = new PrintWriter(dosya);
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[i].length; j++) {

                    yaz.print(matris[i][j] + " ");

                }
                yaz.println();

            }
            yaz.close();
        } catch (Exception e) {
        }
    }
}
