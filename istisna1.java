
package algo2lab;


public class istisna1 {
    public static int sifirabolme(int a,int b){
    int i=a/b;
    return i;
    
    }
    public static void main(String[] args) {
        int a =1;
        int b=0;
        try {
            int i=sifirabolme(a,b);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
