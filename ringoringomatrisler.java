package abc;

import java.util.Random;

public class ringoringomatrisler {
			public static int [][]dizim(int gelen1[][],int gelen2[][]){
				
				int [][]yenidizi=new int[5][5];
				
				for(int i=0;i<gelen1.length;i++) {
					for(int j=0;j<gelen1[i].length;j++) {
						if(gelen1[i][j]==gelen2[i][j]) {
							yenidizi[i][j]=gelen1[i][j];
							
						}
						
					}
					
				}
				
				return yenidizi;
				
			}
	public static void main(String[]args) {
		
		int [][] dizi4= new int[5][5];
	    Random r=new Random();
	    int [][] dizi5=new int[5][5];
		int [][] berkecik=new int[5][5];
	    for(int i=0;i<5;i++) {
	    	for(int j=0;j<5;j++) {
	    		dizi5[i][j]=r.nextInt(10);
	    		dizi4[i][j]=r.nextInt(10);
	    		
	    	}
		
       berkecik=dizim(dizi4,dizi5);		
       for(int x=0;x<dizi4.length;x++) {
    	   for(int y=0;y<dizi4.length;y++) {
    		   System.out.println(berkecik[x][y]);	   
    	   }
       }
		
		
		
		
				
		}
		
	}
	
	
	
	
}
