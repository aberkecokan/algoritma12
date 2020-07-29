package abc;

public class abcd {
	public static String giden1(String gelen1) {
		String a=" ";
		
		for(int i=gelen1.length()-1;i>=0;i--) {
			a+=gelen1.charAt(i);
			
		}
		
		return a;
		
	
	}

	
	public static void main(String[]args) {
		
		System.out.println(giden1("ahmet"));
	}
	
}
