package abc;
import java.util.Scanner;
public class sinav3 {
	public static int ab(String a[]) {
		
		int c=0;
    	for(int b=0;b<5;b++) {
    	for(int y=0;y<a[b].length();y++) {
	if(a[b].charAt(y)=='a') {
	              c=c+1;
		
		
	}
    	
    }
        	  
    
    	
    }
    	return c;
	}    	
	public static void main(String[]args) {
		Scanner k=new Scanner(System.in);
		String [] abc=new String[5];
		for(int i=0;i<5;i++) {
		 abc[i]=k.nextLine();
		}
		System.out.println(ab(abc));
		
	}
	
	
	
	
}
