
package apletalgo2lab;

import javax.swing.JOptionPane;


public class applet2 {
    public static void main(String[] args) {
        String giris=JOptionPane.showInputDialog("İşlem seçiniz:"+"1=+"+"2=-"+"3=*"+"4=/");
        int secim=Integer.valueOf(giris);
        String girilen1=JOptionPane.showInputDialog("İlk sayıyı giriniz");
        
        double sayi1=Double.valueOf(girilen1);
        String girilen2=JOptionPane.showInputDialog("İkinci sayıyı giriniz");
        double sayi2=Double.valueOf(girilen2);
        if (secim==1)  JOptionPane.showMessageDialog(null,"Sonuc:"+ (sayi1+sayi2));
            
        
         else if (secim==2)  JOptionPane.showMessageDialog(null,"Sonuc:"+ (sayi1-sayi2));
            
        
          else  if (secim==3)  JOptionPane.showMessageDialog(null,"Sonuc:"+ (sayi1*sayi2));
            
        
           else   if (secim==4)  JOptionPane.showMessageDialog(null,"Sonuc:"+ (sayi1/sayi2));
            
          else   JOptionPane.showMessageDialog(null,"1-4 arasında seçiniz");
            
        
         
            
        
    }
}
