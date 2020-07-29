package abc;
import java.util.Scanner;
public class abcde1 {
 public static int sayi1(int sayigelen) {
	     int a=0;
	    		 
	    for(int i=1;i<=sayigelen;i++) {
	    	if(sayigelen%i==0) {
	    		a=i;
	    		System.out.println(a);
	    	}
	    	
	    }
	 return a;
 }
 			public static void main(String[]args) {
	 
	 Scanner k=new Scanner(System.in);
	 int x;
	 x=k.nextInt();
	sayi1(x);
	 
	 
 }
}
