//1+1/2+1/3+1/4....1/n e kadar olan işlemi yapan rekursif metot
package algo2lab;


public class recursifmetotlar4 {
    public static double islem(int n){
        if (n==0) {
            return 0;
        }
        else return (double) 1/n+islem(n-1);
    
    }
    public static void main(String[] args) {
        double a=islem(2);
        System.out.println(a);
    }
}
