
package classlar;
 
public class ANACAN {
    public static void main(String[] args) {
        AYI a=new AYI();
        a.beslenir();
        a.nefesalır();
    }
   
}
interface CANLI{
void nefesalır();
}
abstract class INSAN{
abstract void kosar();
}
abstract class HAYVAN implements CANLI{

    abstract void beslenir();
}
class AYI extends HAYVAN {
public void nefesalır()
{
    System.out.println("nefesalır");
}
void beslenir() 
{
    System.out.println("beslenir");
}
}
class ALI extends INSAN{
void kosar (){
    System.out.println("kosar");
}
}