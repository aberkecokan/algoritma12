//kendisine parametre olarak gelen strıng alan ve strıngı seslı harf sayısını gerı donduren rekursıf
package algo2lab;

public class NewClass1 {
    public static int sesliharf(String s){
       int say=0;
        for (int i = 0; i <s.length(); i++) {
            switch(s.charAt(i)){
                case 'a':
                case 'A': say++;break;
                case 'e':
                case 'E':say++;break;
                case 'ı':
                case 'I':say++;break;
                case 'i':
                case 'İ':say++;break;
                case 'o':
                case 'O':say++;break;
                case 'Ö':
                case 'ö':say++;break;
            
            
            
            
            }
        } 
        return say;
    
    }
    public static void main(String[] args) {
        String z="bilgisayar";
        
        int c=sesliharf(z);
        System.out.println(c);
    }
}
