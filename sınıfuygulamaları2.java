//mutlak deger ,us alsın ,buyuk olanı gonder matematik snıfı
package algo2lab;

class matematik {

    public matematik() {
        
        
    }
    

   static double mutlak(double x) {
        if (x < 0) {
            return x * -1;
        } else {
            return x;
        }
    }
    static int mutlak(int x) {
        if (x < 0) {
            return x * -1;
        } else {
            return x;
        }
    }

   static int us(int x, int y) {
        int sonuc = 1;
        
            for (int i = 0; i < y; i++) {
                sonuc = sonuc * x;
            }
            return sonuc;
        
    }

   static double max(double x, double y) {
        if (x < y) {
            return y;
        } else {
            return x;
        }
    }

}

public class sınıfuygulamaları2 {

    public static void main(String[] args) {
matematik m1=new matematik();
        System.out.println("Büyük olan: "+m1.max(5, 3)+" Üssü: "+m1.us(3, 4)+" Mutlak: "+m1.mutlak(-5));//static olmazsa m1 gibi tanıtmalıyız
        System.out.println(matematik.mutlak(-7));//static olursa böle
        System.out.println(matematik.us(5, 3));
    }
}
