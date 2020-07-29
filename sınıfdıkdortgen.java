
package algo2defter;

class dikdortgen{
    double a;
    double b;
dikdortgen(){
a=1.0;
b=1.0;

}

    dikdortgen(double ax, double bx) {
        a = ax;
        b = bx;
    }
  double dikdortgenAlan(){
  return a*b;
  
  }
  double dikdortgenCevre(){
  return 2*(a+b);
  }


}
public class sınıfdıkdortgen {
    public static void main(String[] args) {
      dikdortgen d=new dikdortgen();
        System.out.println("Alan:"+d.dikdortgenAlan()+"Çevre:"+d.dikdortgenCevre());
        dikdortgen d1=new dikdortgen(5.0,2.0);
        System.out.println("Alan"+d1.dikdortgenAlan()+"Çevre:"+d1.dikdortgenCevre());
    }  
}
