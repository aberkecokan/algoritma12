
public class recursive3 {
    public static int bolum(int x,int y){ 
            if (x==y) {
                System.exit(1);
            }
            if (x%7==0) {
                System.out.println(x);
                
            }
            return bolum(++x,y);
    }
    public static void main(String[] args) {
        bolum(1,15);
    }
}
