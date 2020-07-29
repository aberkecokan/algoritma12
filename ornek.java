ýimport java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek {
public static void main(String[]args) {
	
	File dosya=new File("ogrenci.txt");
	PrintWriter p=null;
	Scanner klavye=new Scanner(System.in);
	try {
		if(!dosya.exists()) {
			dosya.createNewFile();
		System.out.println("Adýnýz Soyadýnýz Ve Notunuzu giriniz");
		String ad=klavye.next();
		String soyad=klavye.next();
		int notu=klavye.nextInt();
		p=new PrintWriter(new FileOutputStream(dosya,true));
		p.println(ad+" "+soyad+ " "+notu);
		p.close();
	}}
			catch(Exception e) {
			}
			}
	
}

