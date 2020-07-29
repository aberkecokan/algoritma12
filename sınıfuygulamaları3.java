//this isim benzerlıklerı ıcın ve heryerden ulasılabılır
//this ornegı
package algo2lab;
class nokta{
double a,b;

    public nokta() {
        a=0.0; // bunlar ıse lokal degısken 
        b=0.0;
    }

    public nokta(double a, double b) {
        this.a = a;
        this.b = b;
    }
    void goster(){
        System.out.println(this.a+" "+b);
        System.out.println(mesaj);
    }
    double mesafebul(nokta n1,nokta n2){
    
    double mes=(n1.a-n2.a)*(n1.a-n2.a)+(n1.b+n2.b)*(n1.b+n2.b);
    mes=Math.sqrt(mes);
    return mes;
            
 
    }
    String mesaj="meraba"; // global degısken

}


public class sınıfuygulamaları3 {
    public static void main(String[] args) {
        nokta n=new nokta();
        n.goster();
        nokta n1=new nokta(2.5,3.8);
        n1.goster();
        
    }
}
