package algoderscalisma3hafta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class dosyaveriyazma2 {
			public static void main(String[]args) throws IOException {
				String dosya="D:/yeniornek.txt";
				File abc=new File(dosya);
				if(!abc.exists()) {
					abc.createNewFile();
				}
				int[] ae=new int[10];
				String y=null;
				FileWriter a=new FileWriter(abc,false);
				for(int i=0;i<10;i++) {
					ae[i]=i+1;
					ae[i];
					a.write(y);
				}
			    
				
				a.close();
				
				
				
			}
}
