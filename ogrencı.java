
package dasdasdas;


public class ogrencı {
int numara;
String isim;
int vize;
int genel;
double ortalama;
String harfnotu;

    public ogrencı(int numara, String isim, int vize, int genel) {
       this.numara = numara;
        this.isim = isim;
        this.vize = vize;
        this.genel = genel;
        
    }
    public void orthesapla(){
    ortalama=vize*0.4+genel*0.6;
    }
    public void harfnotu(){
        if (ortalama > 85) { harfnotu="A"; }
        if (ortalama < 85 && ortalama>70) { harfnotu="B"; }
        if (ortalama < 70 && ortalama>60) { harfnotu="C"; }
        if (ortalama < 60 && ortalama>50) { harfnotu="D"; }
        if (ortalama >=0 && ortalama<50) { harfnotu="F"; }
        else{ harfnotu="Geçersiz"; }
    }
   
    public static void main(String[] args) {
        
    }
    
}
