
package algo2lab;
class ogrenci{
int id;
String adi;
    ogrenci(){
id=1;
adi="isimsiz";
}
    ogrenci(int no,String isim){
    id=no;
    adi=isim;
    }
    void goster(){
        System.out.println("Öğrencinin numarası : "+id+" Adı : "+adi);
        
    }
}

public class sınıfuygulamaları {
    public static void main(String[] args) {
        ogrenci ogr=new ogrenci();
        ogr.goster();
        ogrenci ogr1=new ogrenci(5,"Ayşe");
        ogr1.goster();
    }
}
