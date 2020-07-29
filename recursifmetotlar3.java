//bir keimede kaç defa e harfi geçiyor 
İLHAN HOCAYA SOR;
package algo2lab;


public class recursifmetotlar3 {
    public static int karaktertekrar(String s,char c,int indis){
        if (indis==s.length()) {
            return 0;
        }      
        else if 
                (s.charAt(indis)==c);
        return 1+karaktertekrar(s,c,indis+1);
        
        else return 0+karaktertekrar(s,c,indis+1);
          
    
    }
    
    public static void main(String[] args) {
       int a= karaktertekrar("computer engineering",'e',0);
        System.out.println(a);
    }
}
