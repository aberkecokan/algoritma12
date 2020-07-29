//kendisine parametre olaarak bir dizi alsın bir dizi gönderen metot yazılcaktır 
package algo2lab;


public class NewClass2 {
    public static int [] ikikez(int []d){
        int []sonuc=new int[d.length*2];
        int ind=0;
        
        for (int i = 0; i < d.length; i++) {
            sonuc[ind]=d[i];
            sonuc[ind+1]=d[i];
            ind+=2;
        }
    
    return sonuc;
    
    }
    public static void main(String[] args) {
        int []a={1,3,5};
        
        int[]s=ikikez(a);
        for(int i:s){
            System.out.print(i+" ");
        
        }
    }
}
