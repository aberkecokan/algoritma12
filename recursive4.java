
public class recursive4 {
    public static int bul(int x , int sayac){
        if (x==10) {
            return sayac;
        }
        if (x%7==0) {
            sayac++;
        }
        return bul(++x,sayac);
    }
    public static void main(String[] args) {
       int t= bul(1,0);
        System.out.println(t);
    }
    
}
