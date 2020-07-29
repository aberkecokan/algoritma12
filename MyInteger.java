//sayi
package algo2lab;

public class MyInteger {
   int deger;
   public MyInteger(int i){
   this.deger=i;
  
   }
   boolean cıfmi(){
       if (deger%2==0) {
           return true;
       }
       else return false;
   }
   boolean asalmı(){
   boolean asal=true;
       for (int i = 2; i <this.deger/2; i++) {
           if (this.deger%i==0) { asal=false; break;
               
           }
       }
       return asal;
   
   }
   
    public static void main(String[] args) {
        MyInteger sayi=new MyInteger(5);
        if (sayi.asalmı()) {
            System.out.println("Asal sayı");
        }
        else{
            System.out.println("Asal değil");
        }
        
        if (sayi.cıfmi()) {
            System.out.println("sayı cıft");
        }
        System.out.println("tek sayı");
        
        
    }
    
}
