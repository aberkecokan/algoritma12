
package algo2lab;

public class paketler {
   public int x;
   int y;
   private int z;
   public paketler(int x,int y,int z){
   this.x=x;
   this.y=y;
   this.z=z;
   
   }
   private int topla(){
   return x+y+z;
   }
   public double ortalama(){
   return topla()/3.0;
   }
    public static void main(String[] args) {
        paketler p=new paketler(5,10,15);
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.z);
        System.out.println("Toplam : "+p.topla());
        System.out.println("Ortalaması : "+p.ortalama());
    }
}
