
package algolab22kısım;
class ogrenci{
String numara,isim;
adres adr; //
double vize,genel;

    public ogrenci(String numara, String isim, adres adr, double vize, double genel) {
        this.numara = numara;
        this.isim = isim;
        this.adr = adr;
        this.vize = vize;
        this.genel = genel;
    }

    public String toString (){
    
    return numara+"-"+isim+"-"+(vize*0.4+genel*0.6)+adr.toString(); //toString kullanmasanda olur kendı gıder alır
    }


}
class adres{
String mahalle,sokak,sehir;
int no,pkodu;

    public adres(String mahalle, String sokak, String sehir, int no, int pkodu) {
        this.mahalle = mahalle;
        this.sokak = sokak;
        this.sehir = sehir;
        this.no = no;
        this.pkodu = pkodu;
    }
    public String toString(){
    return "["+mahalle+","+sokak+","+no+","+pkodu+","+sehir+"]";
    }

}
public class soyutsınıf2 {
    public static void main(String[] args) {
        
   
    adres adr=new adres("Çaydaçıra Mah", "Deneme","Elazığ", 70, 23119);
    ogrenci o=new ogrenci("175260038", "Ayşe", adr, 70,80);
        System.out.println(o.toString());  //toStringi kullanmassanda aynısını alır getırır   
}}
