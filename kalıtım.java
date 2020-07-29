//iki tane 
package algolab22kısım;
class bisiklet{
public int vites,hız;
public bisiklet(int gear,int speed){
this.vites=vites;
this.hız=hız;
}
public void hızlanır(int arttir){
hız+=arttir;
}
public void frenyap(int azalt){
hız-=azalt;
}
public String toString(){
return "Vites Sayısı:"+vites+"\n speed of bicyle is:"+hız;
} 

}
class DagBisikleti extends bisiklet{
public int kyukseklik;
public DagBisikleti(int vites,int hiz,int ilkyukseklik){
super(vites, hiz); //bisiklet sınıfı kurucu metodu cağrılıyor
kyukseklik=ilkyukseklik;
}
public void setHeight(int yeni){
kyukseklik=yeni;
}

public String toString(){
    return super.toString()+"\n koltuk yüksekliği:"+kyukseklik;


}
}
public class kalıtım {
    public static void main(String[] args) {
         bisiklet b=new bisiklet(4,30);
        System.out.println(b.toString());
        DagBisikleti mb=new DagBisikleti(3,100,25);
        System.out.println(mb.toString());
        
    }
    
    
}
//yazması gereken 3 100 25 4 30
