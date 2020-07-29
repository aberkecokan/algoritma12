

package algo2lab;
import java.util.InputMismatchException;
import java.util.Scanner;
public class istisna {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("sayı girişi:");
        boolean devam=true;
        do{
        try{
        int x=k.nextInt();
        System.out.println("Girilen sayı="+x);
        devam =false;
    }catch (InputMismatchException e){
            System.out.println("hata:"+e.getMessage());
            System.out.println("tip uyuşmazlığı yeniden giriş yap");
            k.nextLine();
            }
        }while(devam);
    }
          
}
