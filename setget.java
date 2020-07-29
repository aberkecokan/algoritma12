//prvate bir 
//private int x;
//void setx(intx)  //veriye atama yapmak
//this.x=x;
//intge
package algo2lab;

class cember{
private double r ;
private static int nsay=0;

    public cember() {
        this(1.0);
        nsay++;
    }

    public cember(double r) {
        this.r = r;
    }
    void setR(double r){
    this.r=r;
    }
    double getR(){
    return this.r;
    }
    double getAlan(){
    return Math.PI*r*r;
    }
    int getNsay(){
    return nsay;
    }
    

}
public class setget {
    public static void main(String[] args) {
        cember c1=new cember(2.4);
        System.out.println(c1.getR()+"yarıcaplı cemberın alanı:"+c1.getAlan());
        System.out.println("nesne sayısı"+c1.getNsay());
         cember c2=new cember(4.4);
        System.out.println(c2.getR()+"yarıcaplı cemberın alanı:"+c2.getAlan());
        System.out.println("nesne sayısı"+c2.getNsay());
    }
 
}
