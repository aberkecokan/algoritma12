//notu 50 ustundeyse gectı degılse kaldı sınıflar
package algo2lab;

import java.util.Scanner;

class ogrenci1{
int id;
String adi;
double notu;

    public ogrenci1(int id, String adi, double notu) {
        this.id = id;
        this.adi = adi;
        this.notu = notu;
    }
    String gectimi(){
        if (this.notu<50) {
            return "kaldı";
        }
        else{
        return "Geçti";
    }}
    

}
public class nesnedizileri {
    public static void main(String[] args) {
      
        
        ogrenci1 []o=new ogrenci1[3];
        Scanner klavye=new Scanner(System.in);
        System.out.println("Üç öğrenci bilgisi gir");
        for (int i = 0; i < o.length; i++) {
            int id=klavye.nextInt();
            String adi=klavye.next();
            double not=klavye.nextDouble();
            o[i]=new ogrenci1(id, adi, not);
            
        }
        System.out.println("İd\tadi\tnotu\tgecçedurumu");
        System.out.println("----------------------------------------------------------------");
       
        
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i].id+" "+o[i].adi+" "+o[i].notu+"-->"+o[i].gectimi());
        }
        
    }
}
