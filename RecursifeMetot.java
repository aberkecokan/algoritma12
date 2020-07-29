//5 kere bilgisayar yaz

public class RecursifeMetot {
    public static int yaz(int i){
    if (i>4) {
    System.exit(1);
   
}
    System.out.println("Bilgisayar");
        return yaz(++i);
        }
   
    public static void main(String[] args) {
        yaz(0);
        
    }
    
}
