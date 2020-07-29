//kendisine parametre olarak matris gelsin matrisin elemanlarını toplayıp geri dondurusun hem metot hem recursif
İLHAN HOCAYA SOR;
package algo2lab;

public class recursifmetotlar5 {
    public static int metot(int[][] matris){
       int topla=0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
              topla+=matris[i][j];  
            }
        }
    
    return topla;
    
    }
    public static int rekursifmetot(int[][] m,int i,int j){
        if (i<m.length && j<m[i].length) {
            return m[i][j]+rekursifmetot(m,i,j+1);
        }
        else if(i<m.length && j>m[i].length)
            return 0+rekursifmetot(m,i+1,0);
        else return 0;
    
    
    
    }
    
    public static void main(String[] args) {
        
        int [][]matris={{1,2,3},{4,5,6},{7,8,9}};
        int a=metot(matris);
        System.out.println(a);
        int b =rekursifmetot(matris,0,0);
        System.out.println(b);
    }
}
