package algoderscalisma3hafta;

import java.io.File;
import java.io.IOException;

public class dosyaoluþt {
	
	public static void main(String[]args) throws IOException {
		String dosyakonumu="D:/ornek1.txt";
		File dosya=new File(dosyakonumu);
		dosya.createNewFile();
		
	}

}
