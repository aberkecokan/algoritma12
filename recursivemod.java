package abc;

public class recursivemod {
  
    
    public static void main(String[]args) {
    	int tutulacaksayi=0;
    		int [] dizim1= {1,9,8,1,2,36,4,8};
    	int[] dizim2= {2,11,7,8,10,8,4,9};
     for(int i=0;i<=7;i++) {
    	 if(dizim1[i]<dizim2[i]) {
    		 tutulacaksayi=dizim1[i];
    		 dizim1[i]=dizim2[i];
    		 dizim2[i]=tutulacaksayi;
    	 }
    	 
     
     
     
    	 System.out.println(dizim1[i]+ 	"   " + "   " + "   "+dizim2[i]);  
     }
   
    
}
}