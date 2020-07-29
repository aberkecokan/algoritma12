//rasyonel sayıların ıslemlerini yapan 
package algo2lab;


 class rasyonelpaket {
    int pay;
    int payda;

    public rasyonelpaket() {
        this(1,1);
    }

    public rasyonelpaket(int pay, int payda) {
        this.pay = pay;
        this.payda = payda;
    }
    void goster(){
        System.out.println(pay+"/"+payda);
    }
     private int ebob{
 int kucuk=pay;
 int eb=1;
             if (payda>kucuk) {
                 kucuk=payda;
                 
             }
             for (int i = 1; i <= kucuk; i++) {
                 if (pay%i==0 && payda%i==0) { eb=i;
                     
                 }
                return eb;
             }
             void sadelestir(){
     int eb=ebob();
     pay=this.pay/eb;
     payda=payda/eb;
     }
         rasyonel topla(rasyonelpaket r1) {
     rasyonelpaket r3=new rasyonelpaket();
     r3.pay=(r1.payda*this.pay+this);
     return r3;
     
     }   
            
 }
   public class testR{
        public static void main(String[] args) {
            rasyonelpaket r1=new rasyonelpaket(2,4);
            rasyonelpaket r2=new rasyonelpaket(4,12);
            r1.goster();
            r1.sadelestir();
            r1.ebob();
             rasyonelpaket r3=r1.topla(r2);
             r3.goster();
             r3.sadelestir();
             r3.goster();
             
        }
    
    }
    
}
