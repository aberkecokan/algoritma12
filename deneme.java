import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
public class deneme {
			public static void main(String[]args) throws Exception  {
				Scanner k=new Scanner(System.in);
				String s=("C:/Users/berke/Desktop/ornekler/ornekler1.txt");
				String c=("C:/Users/berke/Desktop/ornekler/ornekler2.txt");
				File a=new File(s);
				File h=new File(c);
				FileReader e=new FileReader(a);
				FileWriter b=new FileWriter(h,true);
				BufferedReader n=new BufferedReader(e);
				BufferedWriter m=new BufferedWriter(b);
			String w=n.readLine();
			m.write(w);
			
									
			n.close();
			m.close();
			
			}
}
