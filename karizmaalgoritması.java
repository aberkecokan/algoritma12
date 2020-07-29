package karizma;
import java.util.Scanner;
public class karizmaalgoritmasý {
	
	
	public static void main(String[]args) {
		Scanner k=new Scanner(System.in);
		int a;
		int top=0;
		int kalan=0;
		int deneme=0;
		a=k.nextInt();
		
		for(int i=0;i*i<=a;i++) {
			top=i*i;
			deneme=i;
			kalan=a-top;
			
		}
		
		System.out.println("Bu sayýnýn karekökü "+deneme+ "."+ kalan );
	}

}
