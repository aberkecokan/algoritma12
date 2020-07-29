
package algolab22kısım;
class A{
int a,b;
public A(int a,int b){
this.a=a;
this.b=b;
}
int topla(){
return a+b;
}
int topla(int x,int y){
return x+y;
}
}
class yeni extends A{
int c;
public yeni(int a , int b,int c){
super(a, b);
this.c=c;
}
int topla(){
return super.topla()+c;
}
int carp(int f, int g){
   int sonuc=0;
    for (int i = 0; i < g; i++) {
        sonuc+=topla(0,f);
    }
    return sonuc;
}
}

public class kalıtım2 {
    public static void main(String[] args) {
        yeni y=new yeni(3,4,6);
        System.out.println(y.topla());
        System.out.println(y.carp(5,8));
        A a=new A(4,6);
        System.out.println(a.topla());
    }
}
