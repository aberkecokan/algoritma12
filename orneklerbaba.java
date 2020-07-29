package abc;

public class orneklerbaba {
	
	
	public static int sayi(int gelensayi) {
		int toplam=0;
		for(int i=0;i<3;i++) {
			toplam+=gelensayi%10^2;
			gelensayi=gelensayi/10;
			
						
		}
		
		if(gelensayi==toplam) {
			return toplam;
		}
		
		return 0;
		
		
	}

	public static void main(String[]args) {
		int a=0;
		for(int d=100;d<1000;d++) {
			a=d;
			System.out.print(sayi(a));
		}
		
		
		
	}
	
	
	
}
