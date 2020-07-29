import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class doyadoya {
			public static void main(String[]args) throws IOException {
				String a="C:/Users/berke/Desktop/ornekler/tek2.txt";
				String c="C:/Users/berke/Desktop/ornekler/cift2.txt";
				File b=new File(a);
				File y=new File(c);
				FileReader x=new FileReader(b);
				FileWriter q=new FileWriter(y);
				BufferedReader w=new BufferedReader(x);
				BufferedWriter m=new BufferedWriter(q);
				String s=w.readLine();
				m.write(s);
				m.close();
				
				
				
				
				
				
				
			}
}
