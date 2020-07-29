//kendisine paremetre olarak dizi alan ve dizinin enb ve enksını bulup geri gönderen metot
package algo2defter;

public class metotlar {

    public static int[] enkenb(int [] dizi){
    int [] ebek=new int[2];
    ebek[0]=dizi[0];
    ebek[1]=dizi[0];
        for (int i = 0; i <dizi.length; i++) {
            if (ebek[0]<dizi[i]) {
                ebek[0]=dizi[i];
            }
            if (ebek[1]>dizi[i]) {
                ebek[1]=dizi[i];
            }
        }
        return ebek;
    
    }
    public static void main(String[] args) {
    int[] d ={3,4,5,6,2,1,6,8,4,3,11,576};
    int[] sonuc=new int[2];
    sonuc=enkenb(d);
        System.out.println(sonuc[0]);
        System.out.println(sonuc[1]);
    }
    
}
