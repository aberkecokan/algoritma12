import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class dosyayazma {
			public static void main(String[]args) throws FileNotFoundException {
				String a="C:/Users/berke/Desktop/ornekler/ornekler2.txt";
				File f=new File(a);
				PrintWriter x=new PrintWriter(a);
				try {
					if(!f.exists()) {
						f.createNewFile();
						
					}
					else {
						System.out.println("Bu Dosya Mevcut");
					}
					x.print("Ahmet Berke Çokan1");
					x.close();
				}
				
				catch(Exception e) {
				System.out.println("Hata Var");	
				}
			}
}
