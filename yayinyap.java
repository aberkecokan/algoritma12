

interface cihaz{
			public void ac();
			public void kapat();
			public void goster(String s);
			
		}
		
		class tv implements cihaz{
			public void ac() {
				
				System.out.println("Tv Açýldý");
				
			}
			public void kapat(){
				System.out.println("Tv Kapandý");
			}
			public void goster(String s) {
				System.out.println("Tv Gösteriyor");
			}
			
		}
		class lcd implements cihaz{
			public void ac() {
				System.out.println("Lcd Açýldý");
			}
			public void kapat() {
				System.out.println("Lcd Kapandý");
			}
			public void goster(String s) {
			System.out.println("Lcd gosteriyor"+s);
			
		}}
		class projektor implements cihaz{
			public void ac() {
				System.out.println("Projektör Açýldý");
			}
			public void kapat() {
				System.out.println("Projektör kapandý");
			}
			public void goster(String s) {
				System.out.println("Projektör gösteriyor"+s);
			}
		}
		
public class yayinyap {
	public static void yayinYap(cihaz[] cihazlar) {
		for(int i=0;i<cihazlar.length;i++) {
			cihaz cihaz=cihazlar[i];
			cihaz.ac();
			cihaz.goster("test yayýný");
			cihaz.kapat();
		}
	}
	public static void main(String[]args) {
		cihaz c1=new tv();
		cihaz c2=new lcd();
		cihaz c3=new projektor();
		cihaz [] dizi=new cihaz[3];
		dizi [0]=c1;
		dizi[1]=c2;
		dizi[2]=c3;
	
		yayinyap.yayinYap(dizi);
	//	tv a =new tv();
	//	a.ac();
	//	a.kapat();
	//	lcd b=new lcd();
	//	b.kapat();
			
		
	}
	
	
	

}
