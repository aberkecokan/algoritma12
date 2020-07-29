
package algolab22kısım;

abstract class Body{
public double yogunluk;
public Body(double y){
yogunluk=y;
}
public double getYogunluk(){
return yogunluk;
}
public double getKutle(){
return yogunluk*getHacim();
}
public abstract getHacim();

}
class Kup extends Body{
double kenar;

    public Kup(double y) {
        super(y);
        this.kenar=kenar;
    }


    
    public double getHacim() {
        return kenar*kenar*kenar;
    }


}
public class soyutsınıf {
    public static void main(String[] args) {
        Kup k=new Kup(4.0,3.0);
        System.out.println("Kütle:"+k.getKutle());
        System.out.println("Hacim:"+k.getHacim());
        System.out.println("Yogunluk:"+k.getYogunluk());
        
    }
}
