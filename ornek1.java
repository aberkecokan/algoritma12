import java.util.Scanner;
public class ornek1 {

	public static void main(String[]args) {
		Scanner k=new Scanner(System.in);
		int a=0;
		try {
			
		a=k.nextInt();
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("Hatalý Giriþ Yaptýnýz");
			
		}
	}
}
