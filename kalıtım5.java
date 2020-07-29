//ucgen sınıfı olusturulucak
//veri alanları kenar1,kenar2,kenar3
//var sayılan kurucudan kenarlara 1.0 degerı alıcak
//gırılen parametrelerı kenarlara atayan kurucu metot
//getAlan(),getCevre ve  metotlarını yazınız
//tostrıng () metodu ise eskenar bılgılerını gosterır
//eskenar sınıf dıkdortgen turetıcek eskenarmı dıger kurucu metotlar eklenecektır

package algolab22kısım;
class ucgen{
double kenar1,kenar2,kenar3;

    public ucgen() {
        this.kenar1=1.0;
        this.kenar2=1.0;
        this.kenar3=1.0;
        
    }

    public ucgen(double kenar1, double kenar2, double kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
        
    }
    double getCevre(){
    return kenar1+kenar2+kenar3;
    
    }
    double getAlan(){
  double u=getCevre()/2;
  return Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
    
    }
    public String toString(){
    return "Üçgenin alanı:"+getAlan()+"Üçgenin çevresi:"+getCevre();
    
    }

}
class eskenar extends ucgen{

    public boolean eskenar() {
        boolean eskenarmı;
    if (this.kenar1==this.kenar2 && this.kenar2==this.kenar3) {
        eskenarmı=true; 
    }
    else{
    eskenarmı=false;
    }
    return eskenarmı;
    
    }



}


public class kalıtım5 {
    public static void main(String[] args) {
        ucgen u=new ucgen(3,5,7);
        System.out.println(u.toString());
        eskenar es=new eskenar();
        System.out.println(es.getAlan());
        System.out.println(es.eskenar());
    }
}
