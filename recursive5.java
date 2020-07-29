  
import java.util.Scanner;

//klavyeden girilen iki sayı arasındaki 7 ye bolunebilen tam sayıların  kac adet oldugunu bulup cagrıldıgı yere gerı donduren

public class recursive5 {
    public static int bul(int x, int y,int sayac){
        if (x==y) {
            return sayac;
            
        }
        if (x%7==0) {
            sayac++;
        }
        return bul(++x,y,sayac);
        
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int x;
        int y;
        x=k.nextInt();
         y=k.nextInt();
        int t= bul(x,y,0);
         System.out.println(t);
    }
}
