import java.io.File;
import java.io.IOException;
public class dosya1 {

	public static void main(String[]args) {
	 String a=("C:/Users/berke/Desktop/ornekler");
	 File b=new File();
	 
	 		
	 			try {
	 				if(!b.exists()) {
	 				b.createNewFile();
				} 
	 				else {
	 					System.out.println("Dosya Mevcut");
	 			}}
	 			
	 			
	 			catch (IOException e) {
					System.out.println("Hata Oluþtu");
				}
	 		}
	 
	}
	

