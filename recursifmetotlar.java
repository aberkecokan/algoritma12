//faktöriyel hesaplayan rekursif metot
package algo2lab;


public class recursifmetotlar {
    public static int rfaktoriyel(int n ){
        if (n==0) {return 1;
            
        }
        else return n*rfaktoriyel(n-1);
    
    } 
    public static void main(String[] args) {
        int a=rfaktoriyel(6);
        System.out.println(a);
    }
}
