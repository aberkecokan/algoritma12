//bir string terten yazan metot
package algo2defter;

public class metotlar4 {
    public static String terscevir(String c){
    String a=" ";
        for (int i =c.length()-1; i >=0; i--) {
            a=a+c.charAt(i);
        }
    return a;
    }
    public static void main(String[] args) {
        String gelen=terscevir("yaprak");
        System.out.println(gelen);
    }
}
