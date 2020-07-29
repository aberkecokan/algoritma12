import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class dosyam {
			public static void main(String[]args) throws IOException {
				String a="C:/Users/berke/Desktop/ornekler/tek1.txt";
				int b=0; 
				String y;
				Scanner k=new Scanner(System.in);
				File c=new File(a);
								FileWriter x=new FileWriter(a,true);
								BufferedWriter w=new BufferedWriter(x);
				if(!c.exists()) {
			c.createNewFile();
				}
				else {
				b=k.nextInt();
				if(b%2==0) {
					y=" -->"+b;
				w.write(y);
				
				}
				w.close();
			}
			}}

