package abc;

public class deneme {

	public static int rekursif(int []gelen1,int toplam,int index) {
		
		if(gelen1.length>index) {
			toplam=toplam+gelen1[index];
			return rekursif(gelen1,toplam,index+1);
			
		}
		
		else {
			
			return toplam;
			
		}
		
	}
	public static void main(String[]args) {
		
		int[] dizi1={2,4,5,6,7};
	 
		System.out.println(rekursif(dizi1,0,0));
	}
	
	
}
