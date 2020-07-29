package abc;
import java.util.Scanner;
public class ginal1dizi {
	public static void main(String[]args) {
	
		Scanner k=new Scanner(System.in);
		int a=0;
		int x=0;
		int sayac=0;
		a=k.nextInt();
		for(int i=a;a>=0;a--) {
			x=a%10;
			a=a/10;
				if(x==0) {
					sayac++;
				
				
			}
				}
		
		
		System.out.println(sayac);
		
		
		
		
		
		
		
		
		
	}}