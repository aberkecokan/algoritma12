import java.util.Scanner;
public class ornek2 {
		//Hata Yakalýyor;
	
	public static void main(String[]args) {
		
		String a="Ahmet Berke";
		int[] dizi= {1,3,6,9,5,41};
		int ab=0;
		Scanner k=new Scanner(System.in);
		try {
			ab=k.nextInt();
			a.charAt(3);
			System.out.println("Hata Yok Gardaþ");
			int x=dizi[52];
			
		}
		catch(Exception e) {
			System.out.println("Hata Oluþtu");
		}
		
	
	}
}
