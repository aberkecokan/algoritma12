//kendisine parametre olarak sayı gelıyor bu sayının asal olup olmadığını true yada false cevaplıyan metot 
package algo2defter;

public class metotlar2 {
    public static boolean asalmi(int x){
    boolean asal=true;
        for (int i = 2; i <x/2; i++) {
            if (x%i==0) { asal=false; break;
                
            }
        }
        return asal;
       
    
    }
    public static void main(String[] args) {
       
        boolean c =asalmi(12);
        System.out.println(c);
    }
}
