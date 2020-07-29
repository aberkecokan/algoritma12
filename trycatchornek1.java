import java.util.Scanner;
//Ýstisna Örneði
public class trycatchornek1 {
		public static void main(String[]args) {
Scanner k =new Scanner(System.in);
	String s="Bilgisayar";
			int []dizi= {1,2,3,4,5,8,10,12};
			int a=60,b=5,c=5;
			try {
				int sonuc=a/(b-c);
				char y=s.charAt(15);
				System.out.println("Sonuç="+sonuc);
				int sayi=k.nextInt();
				System.out.println(dizi[7]);
				System.out.println("Girilen Sayi:"+sayi);
			
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("String Sýnýrlarý Aþýldý");
			}
catch(ArithmeticException ex) {
			System.out.println("Aritmetik Ýstisna Oluþtu");	
				
			}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Dizi Sýnýrlarý AÞýldý");
				
				
			}
			catch(Exception e) {
				System.out.println("Ýstisna Oluþtu");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
}
