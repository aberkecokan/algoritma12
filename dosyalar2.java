//5 tane dosya oluşturan kod ve klasorun ıcındekı dosyların ısmını veren kod 
package algo2lab;

import java.io.File;

public class dosyalar2 {
    public static void main(String[] args) {
        File d=null;
        try {
            for (int i = 0; i <= 4; i++) {

                d = new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar\\"+i + ".txt");

                d.createNewFile();
            }
            System.out.println("");
                File klasor=new File("C:\\Users\\Yasin Doğan Çakar\\Desktop\\dosyalar");
                File []dosyalar=klasor.listFiles();
                for (int i = 0; i <dosyalar.length; i++) {
                    if (dosyalar[i].isFile()) {
                        System.out.println(dosyalar[i].getName());
                    }
            }
            
        } catch (Exception e) {
        }
}}
