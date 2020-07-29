
public class recursive2 {
    public static int bul (int x){
        if (x>99) { 
               
            System.exit(1);  
        }
        if (x%7==0) {
            
            System.out.println(x); 
        }
       return bul(++x);
      
    }
    public static void main(String[] args) {
        bul(0);
    }
}
