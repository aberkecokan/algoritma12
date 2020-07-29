//0dan n e kadart olan sayıların toplamı
package algo2lab;


public class recursifmetotlar2 {
    public static int rtopla(int n){ 
        if (n==0) {return 0;
            
        }
        else return n+rtopla(n-1);
    
    }
    public static void main(String[] args) {
    int a=rtopla(5);
        System.out.println(a);
    }
}
