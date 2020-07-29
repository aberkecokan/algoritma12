package finaloncesideneme1;

public class denemeler {
	
	public static String gelen1(int gelensayi) {
		
		String a="yazdirilamadi";
		String b="yazdirildi";
		
		if(gelensayi<0) {
			
			return "yazdirilamadi";
			
			
		}
		else {
			
			System.out.println("Ahmet Berke Çokan");
			return gelen1(gelensayi-1);	
		}
		
		
		
	
	
    	  
      }
public static void main(String[]args) {
	
	gelen1(5);
	
	
	}

}
