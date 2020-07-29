//interface implements edilince metotlarının ıcı doldurulur...
package algolab22kısım;
interface madde{
public double getHacim();
public double getYogunuk();
public double getKutle();
}
class kup implements madde{ //implements ediyoruz ve metotları doldutuyoruz..
public double kenar=1.0,yogunluk=1.0;
    @Override
    public double getHacim() {
        return kenar*kenar*kenar;
    }

    @Override
    public double getYogunuk() {
        return yogunluk;
    }

    @Override
    public double getKutle() {
        return yogunluk*getHacim();
    }



}

public class arayuz {
    public static void main(String[] args) {
        kup k=new kup();
        System.out.println(k.getHacim()+" "+k.getKutle()+" "+k.getYogunuk());
    }
}
