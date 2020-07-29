package siniflarlab2;
	class matematik{
		
		
		final static double PI=3.14;
		final static double e=2.71;
		static int abs(int x) {
			if(x<0) return x*(-1); 
			else return x;	
		}
		static int pow(int x,int y){
			int sonuc=1;
			for(int i =0;i<y;i++) {
				sonuc=sonuc*x;
			}
			return sonuc;
		}
		static int max(int a,int b) {
			if(a>b) return a;
			else return b;
		}
	}

public class Siniflarlab2 {
		public static void main(String[]args) {
			System.out.println(matematik.PI);
			System.out.println(matematik.pow(2, 3));
		}
}
