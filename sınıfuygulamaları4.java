//bitcoin hesaplama
package algo2lab;
class piyasa{
String ismi;
String sembol;
double ilk_fiyat=100;
double son_fiyat=120;

    

     piyasa(String i, String s,double ilk,double son) {
        this.ismi=i;
        this.sembol=s;
        this.ilk_fiyat=ilk;
        this.son_fiyat=son;
    }

    void goster(){
       double fark=this.son_fiyat-this.ilk_fiyat;
        System.out.println("Değişim "+fark+" kadar oldu");
        if (this.son_fiyat>this.ilk_fiyat) {
            System.out.println("Artış oldu");   
        }
        else{
            System.out.println("Azalış oldu");
        }
        double yuzde=fark/this.ilk_fiyat*100;
        System.out.println("yüzde değişim "+yuzde);
    }

   
}

public class sınıfuygulamaları4 {
    public static void main(String[] args) {
        piyasa p=new piyasa("Ripple","XRP",0.56,0.68);
        p.goster();
        p.son_fiyat=0.82;
        p.goster();
        System.out.println("Coin ismi "+p.ismi);
        System.out.println("Coin sembolü "+p.sembol);
       
        
        
    }
}
