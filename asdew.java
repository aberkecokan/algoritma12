package abc;

public class asdew {
	public static int rekursive(int faktoriyel,int sonuc) {

		
		
		if(faktoriyel==1) {
		   return sonuc	;
			
			
		}
		else {
			sonuc=sonuc*faktoriyel;
			
		}
		
		return rekursive(faktoriyel-1,sonuc);
	}

	
	public static void main(String[]args) {
		  int a=5;
		  int s=1;
		  System.out.println(rekursive(a,s));
	}
	
	
}
