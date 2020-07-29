 
package metot;


public class Metot {

    public static String ters(String s){
       String s1=" ";
      
        for (int i = s.length()-1; i >= 0; i--) {
      s1+=s.charAt(i);
          
        }
        return s1;
      
      
    
    }
    public static void main(String[] args) {
  String a=ters("YAPRAK");
        System.out.println(a);
    }
    
}
