
package algo2final;
class A extends Thread{
String isim;
int saniye;

    public A(String isim, int saniye ) {
        
        this.isim = isim;
        this.saniye = saniye;
    }
    public void run (){
        
        
        try {
            Thread.sleep(saniye*1000);
        } catch (Exception e) {
        }
        System.out.println(isim);
     
    
        }



}
public class ALGO2FİNAL  {
    public static void main(String[] args) {
       A a=new A("Berke",10);
       a.start();
    }
   
    
    
}
