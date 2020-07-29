package abc;
import java.util.Scanner;
public class ornek1 {
	
	
	public static void main(String[]args) {
		Scanner k=new Scanner(System.in);
		int x;int top=0;
		
		x=k.nextInt();
		for(int g=1;g<x;g++) {
			
			if(x%g==0) {
				top=top+g;
			}
		if(top==x) {
			System.out.println(x);
			
			
		}
		}
				
	}}
