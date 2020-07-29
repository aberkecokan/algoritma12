//kendisine parametre olarak string alsın büyük harf ve küçük garf sayısını geri göndersin
package algo2defter;


public class metotlar3 {
    public static int[] bkharf(String s){
    int [] sonuc=new int[2];
    sonuc[0]=0;
    sonuc[1]=0;
            for (int i = 0; i <s.length(); i++) {
                if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                    sonuc[0]++;
                }
                if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                    sonuc[1]++;
                }
            }
            return sonuc;
    }
    
    public static void main(String[] args) {
    int []c=new int[2];
   String str="BilgisiyarMB";
        c=bkharf(str);
        System.out.println(c[0]);
        System.out.println(c[1]);
    }
}
