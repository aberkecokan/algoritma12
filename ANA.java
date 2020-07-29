 
package classlar;
interface hayvan{
public static void akıllı(){ 
}
}
 class aslan implements hayvan{
    public  void akıllı(){
        System.out.println("akıllıdır");
    }
public  void guclu(){
    System.out.println("güçlüdür");
}
}
 class kedi extends aslan {
    aslan k=new aslan();
    public void nankor(){
        System.out.println("nankör pislik");
    }}
abstract class kus implements hayvan{
    abstract void ucar();
}
class kelebek extends kus{
  void guzel(){
    System.out.println("kelebek güzeldir");
}
  void ucar(){
    System.out.println("uçarlar");
}
  void akıllı(){
        System.out.println("akıllıdır");}
}
public class ANA{
    public static void main(String[] args) {
        kedi kd=new kedi();
        kd.guclu();
    }
}
 

