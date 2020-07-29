package algo2lab;
class dikdortgen{
double a,b;
static int say=0;
     dikdortgen() {
        a=1;
                b=1;
                say++;
    }

    public dikdortgen(double ax, double bx) {
       a = ax;
       b = bx;
       say++;
    }
    double alanHesapla(){
    return a*b;
    
    
    }
    double cevreHesapla(){
    return 2*(a+b);
    }
     static int kacnesne(){ 
    return say;
    }
    


}
public class sınıfuygulamaları1 {
    public static void main(String[] args) {
        dikdortgen d1=new dikdortgen();
        System.out.println(d1.a+" "+d1.b+" "+"kenarlı dikdörtgen alanı:"+d1.alanHesapla()+" Çevrensi:"+d1.cevreHesapla());
        dikdortgen d2=new dikdortgen(2,3);
        System.out.println("Alanı:"+d2.alanHesapla());
        System.out.println("Nesne sayısı"+d2.kacnesne());
        
       
    }
}
