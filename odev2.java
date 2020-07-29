
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class odev2 {
 
 public static void main(String[] args) throws IOException {
  File myFile=new File("D:/ornek.txt");
  readFile(myFile);
 }
 
  public  static void readFile(File myFile) throws IOException
     { 
    int satirsayisi = 0;
    int a=0;
         try
         {
         BufferedReader reader = null;
         reader = new BufferedReader(new FileReader(myFile));
         String satir = reader.readLine();
             while (satir!=null) {
              if(satir.length()>0){
               satirsayisi++;
              }
              satir = reader.readLine();
             a=satir.length();
             }    
         }catch(final IOException e){}
         System.out.println("Verilen Dökümandaki Satýr Sayýsý: "+satirsayisi+a);
     }
}

