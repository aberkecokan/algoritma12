//kendisine paremetre olarak bir karakter alsın eğer karakter küçükse büyük harfe büyüksede küçük harfe çevirsin
package algo2defter;


public class metotlar5 {
    public static char bbkk(char harf){
        
        if (harf>='A' && harf<='Z') {
            return (char) ((int)harf+32);
        }
        if (harf>='a' && harf<='z') {
            return (char) ((int)harf-32);
        }
        else return harf;
    
    
    
    }
    public static void main(String[] args) {
      char c=bbkk('K');
        System.out.println(c);
    }
}
