import java.io.File;
import java.io.IOException;
public class dosya {
	
	
	
	public static void main(String[]args) throws IOException {
				String a=();
					File f=new File(a);
					if(!f.exists()) {
						f.createNewFile();
						System.out.println("Baþarý ile tamamlandý");
						
					}
					else {
						f.delete();
						System.out.println("Artýk Yok");
					}
}}
