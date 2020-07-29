
package classlar;

import java.util.*;
import java.io.*;
public class alan {
    public static void main(String[] args) {
        kare a=new kare();
        dikdörtgen b=new dikdörtgen();
        a.karea(5);
        b.dikdörtgena(3, 5);
    }
    
}
class kare extends alan{
public void karea(int a ){
int sonuc;
sonuc=a*a;
    System.out.println("karenin alanı ="+sonuc);
}

}
class dikdörtgen extends alan{
public void dikdörtgena(int a,int b){
int sonuc;
sonuc=a*b;
    System.out.println("dikdörtgenin alanı ="+sonuc);
}
}
