import java.util.*;
public class recursive6 {
    public static int bul(int a,int b,int sayac){
        if (a==b) {
            return sayac;
        }
        if (a%7==0){
    sayac++;
        }
  return bul(++a,b,sayac);
    
    }
    
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        
       int a=k.nextInt();
       int b=k.nextInt();
       int t=bul(a,b,0);
        System.out.println(t);
    }
}
