package abc;

public class ornekleredevam {
			public static String dondur(String gelen1,String gelen2) {
				String a=" ";
				
				for(int i=0;i<gelen1.length();i++) {
					if(gelen1.charAt(i)==gelen2.charAt(i)) {
						a=gelen1.charAt(i)+a;
					}
						
						
					}
				System.out.println(a);
				return a;
				}
				
		
			
			public static void main(String[]args) {
				String b="ahmet";
				String c= "aðladýkça";
				dondur(b,c);
			}}
