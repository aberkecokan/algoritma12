
package dasdasdas;

class Eleman{
int icerik;
Eleman ileri,bas,son;


Eleman(int icerik){
this.icerik=icerik;
ileri=null;
}
public void BasaEkle(Eleman yeni){

}
}
public class ornek {
    
    public static void main(String[] args) {
        Eleman b1=new Eleman(5);
         Eleman b2=new Eleman(9);
          Eleman b3=new Eleman(8);
          
   Eleman bas=b1;
   b1.ileri=b2;
   b2.ileri=b3;
        while (bas!=null) {            
            System.out.println(bas.icerik);
        bas=bas.ileri;
        }
    }
  
}
