import java.io.File;
import java.util.Scanner;

public class kendimizyap {
			public static void main(String[]args) {
				File a=new File("dosya1.txt");
				File b=new File("dosya2.txt");
				File c=new File("dosya3.txt");
				File d=new File("dosya4.txt");
				File e=new File("dosya5.txt");
				
			
				Scanner k=new Scanner(System.in);
				String s,j;
				j="dosya1";
				s=k.nextLine();
				if(s==j) {
					a.delete();
					System.out.println("Silindi");
				}
				
			
					
				}
				
				
			}

