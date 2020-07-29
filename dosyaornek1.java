import java.io.File;
public class dosyaornek1 {
			public static void main(String[]args) {
				String a="C:/Users/berke/Desktop/ornekler";
				File x=new File(a);
				if(!x.exists()) {
					System.out.println(x.length());
					System.out.println(x.canRead());
					System.out.println(x.getName());
					
					
				}
				else {
					System.out.println("Mal böyle yer yok fakir");
				}
				
				File [] ab=x.listFiles();
				for(int i =0;i<ab.length;i++) {
					System.out.println(ab[i]);
				}
			}
}
