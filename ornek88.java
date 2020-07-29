package abc;

import java.util.Random;

public class ornek88 {
     public static int sayi(int[] dizi1,int []dizi2) {
    	 int deger=0;
    	 for(int i=0;i<100;i++) {
    		 if(dizi1[i]==dizi2[i]) {
    			 deger=dizi1[i];
    			System.out.println(deger); 
    		 }
    		 
    	 }
    	 
    	 return deger;
     }
     
     public static void main(String[]args) {
    	  Random r=new Random();
    			  
    	 int[] dizim=new int[100];
    	 int[]dizim2 =new int[100];
    	 for(int i=0;i<100;i++) {
    		 dizim[i]=r.nextInt(100);
    		 dizim2[i]=r.nextInt(100);
    	 }
    	 sayi(dizim,dizim2);
     }
}
