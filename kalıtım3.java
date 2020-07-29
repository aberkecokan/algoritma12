
package algolab22kısım;
class ebeveyn{
void goster(){
    System.out.println("ebeveyn");
}
}
class cocuk{
void goster(){
    System.out.println("cocuk");
}
}

public class kalıtım3 {
    public static void main(String[] args) {
        ebeveyn obj1=new ebeveyn(); obj1.goster();
        cocuk obj2=new cocuk(); obj2.goster();
    }
}
