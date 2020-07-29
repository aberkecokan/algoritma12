package algolab22kısım;

class karematris {

    int sstun;
    double[][] mat;

    public karematris(int sutun) {
        mat = new double[sutun][sutun];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 15);
          }
       }
    }

    public String toString() {
        String s = " ";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                s = s + mat[i][j] + "\t";
                
            }s = s + "\n";
        }
        return s;
    }
}
class ucgenmatris extends karematris{
boolean ust;

    

    public ucgenmatris(boolean ust,int sutun) {
        super(sutun);
        this.ust=ust;
        if (ust) {
            for (int i = 0; i <mat.length; i++) {
                for (int j = i+1; j < mat[i].length; j++) {
                    mat[i][j]=0.0;
                }
            }
        }
        else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < i; j++) {
                    mat[i][j]=0.0;
                }
            }
        
        
        
        }
    }
    public String toString(){
    return "Üçgen matris:\n"+super.toString();
    
    }

}


public class kalıtım6 {
    public static void goster(karematris km){
        System.out.println(km.toString());
    
    }
    public static void main(String[] args) {
        karematris km=new karematris(4);
        goster(km);
        ucgenmatris um=new ucgenmatris(true,3);
       goster(um);
    }
}
// kare ve ucgun seklınde yazması lazım ?