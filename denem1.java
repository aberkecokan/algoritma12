import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class denem1 {
		public static void main(String[]args) throws IOException {
			
			Scanner k=new Scanner(System.in);
			String x="C:/Users/berke/Desktop/ornekler/tek2.txt";
			String w="C:/Users/berke/Desktop/ornekler/cift2.txt";
			File a=new File(x);
			File b=new File(w);
			FileWriter s=new FileWriter(a,true);
			FileWriter d=new FileWriter(b,true);
			BufferedWriter q=new BufferedWriter(s);
			BufferedWriter e=new BufferedWriter(d);
			int j=0;
			String u;
			while(j!=999) {
				j=k.nextInt();
				if(j%2==0) {
					u="-"+j;
					q.write(u);
						
				}
				
				else {
					u="--"+j;
					e.write(u);
					
				}
				
				
			}
			e.close();
			q.close();
			
		}
}
