import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class odev1 {
			public static void main(String[]args) throws IOException {
				
				String dosya="D:/test.txt";
				String [] ab=new String[70];
				File dosya1=new File(dosya);
				BufferedReader k=new BufferedReader(new FileReader(dosya));
				String satir;
				while(k.read){
					String yazi=k.readLine();
					for(int i=0;i<70;i++) {
					     ab[i]=k.readLine();
					    System.out.println(ab[i]);
					}
					if(yazi!=null) {
						System.out.println(yazi);
					}
				}
			}
}
