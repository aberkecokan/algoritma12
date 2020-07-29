
package algo2defter;
class ornek{
double a;
double b;

    public ornek() {
        a=3.0;
        b=3.0;
    }

    public ornek(double a, double b) {
        this.a = a;
        this.b = b;
    }
    boolean asalmı(){
    boolean asal=true;
        for (int i = 2; i < a/2; i++) {
            if (a%i==0) { asal=false;
            break;
                
            }
            
        }
        return asal;
    
    }

   

}

public class sınıflarornek {
    public static void main(String[] args) {
         ornek o=new ornek();
         System.out.println(o.asalmı());
         ornek o1=new ornek(8.0,5.0);
         System.out.println(o1.asalmı());
    }
 
}
