
package algolab22kısım;

class sekıl{
String renk;
public sekıl(String renk){
this.renk=renk;
}
double getAlan(){
return -1;
}
}
class dikdortgen extends sekıl{
    int a,b;
dikdortgen(int a,int b,String renk){
super(renk);
this.a=a;
this.b=b;
}
double getAlan(){
return a*b;
}}
class cember extends sekıl{
double r;
cember(double r,String renk){
super(renk);
this.r=r;

}
double getAlan(){
return Math.PI*r*r;

}
}

public class kalıtım4 {
    public static void goster(sekıl s){
        System.out.println(s.getAlan());
    }
    public static void main(String[] args) {
        dikdortgen d=new dikdortgen(5,10,"mavi");
        goster(d);
        cember c=new cember(2.5,"sarı");
        goster(c);
    }
}
