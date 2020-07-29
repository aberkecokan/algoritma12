import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class dosyaokuma {

	public static void main(String[]args) throws FileNotFoundException {
		String a ="C:/Users/berke/Desktop/ornekler/ornekler.txt";
		File b=new File(a);
		PrintWriter x=new PrintWriter(a);
		try {
			if(b.exists()) {
				x.print("Ahmet Berke Çokan");
				x.close();
				
			}
		}
	catch(Exception e) {
		System.out.println("Hata Oluþtu");
		
		
		
	}
	
		}
	



					}		
