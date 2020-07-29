package abc;

public class asdesf {
		public static int giden(int[] gelen1,int gelensayi) {
			  int a=0;
			a=gelen1[gelensayi];
			a=a-1;
			gelen1[gelensayi]=a;
			
			return a+1;
			
			
			
			
			
			
		}
		
		public static void main(String[]args) {
			int [] dizi2= {1,2,34,5,6};
			int gelensayi=2;
			System.out.println(giden(dizi2,gelensayi));
			
		}
		
		
}
