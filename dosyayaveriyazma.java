package algoderscalisma3hafta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class dosyayaveriyazma {
			public static void main(String[]args) throws IOException {
				String a="D:/yazmaornegi.txt";
				File dosya=new File(a);
				if(!dosya.exists()) {
					dosya.createNewFile();
				}
				FileWriter abc=new FileWriter(dosya,true);
				BufferedWriter ac=new BufferedWriter(abc);
				ac.write("Selam kýzlar sikim sýzlar");
				ac.close();
			}
}
