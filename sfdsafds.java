package abc;

public class sfdsafds {
	public static int rekursive(int sayi,int us,int sonuc) {
		
		
		if(us>=1) {
			sonuc=sonuc*sayi;
			
		}
		else {
			return sonuc;
		}
		
		return rekursive(sayi,us-1,sonuc);
		
	}
			public static void main(String[]args) {
				int a=2;
				int b=8;
				int c=1;
				System.out.println(rekursive(a,b,c));
				
			}
}
