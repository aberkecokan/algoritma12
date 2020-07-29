import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class yenidosya {
		public static void main(String[]args) throws IOException {
				String a="C:/Users/berke/Desktop/ornekler/tek.txt";
				String b="C:/Users/berke/Desktop/ornekler/cift.txt";
				Scanner k=new Scanner(System.in);
				File x=new File(a);
				File y=new File(b);
				int i=0;
			FileWriter m=new FileWriter(a,true);
			FileWriter n=new FileWriter(b,true);
		BufferedWriter v=new BufferedWriter(n);
		BufferedWriter w=new BufferedWriter(m);
		while(i!=999){
			i=k.nextInt();
			try {
				if(x.exists()) {
					x.createNewFile();
					y.createNewFile();
					
					if(i%2==1) {
						v.write(i);
						v.close();
					}
					else {
						n.write(i);
						n.close();
					}
				}
				
			}
			catch(Exception e) {
				
				System.out.println("Bir Hata Oluþtu");
				
			}	
		}
		
		
		
}}

