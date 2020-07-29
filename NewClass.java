//kendisine parametre olaarak gelen ıkı sayı alan ve iki sayı arasındakı sayıları ekrana gosteren recursif metot
package algo2lab;


public class NewClass {
    public static void goster(int a,int b){
        
        if (a>b) { //returnsuz ifin icine a<=b
            return ; 
        }
        else {
            System.out.println(a);
                    goster(a+1,b);
        }
        
    }
    public static void main(String[] args) {
        
       
            goster(3,10);
          
    }
}
