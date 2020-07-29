package abc;

import java.util.Random;

public class aganigi {

		public static int[][]giden1(int gelen[][],int gelen2[][]){
					
			int	a=gelen.length;
			int	b=gelen[0].length;
						
		int [][]dizi=new int[a][b];
			for(int j=0;j<gelen.length;j++) {
				for(int y=0;y<gelen[j].length;y++) {
					dizi[j][y]=gelen[j][y]*gelen2[j][y];
					
		
				}
						
			}
			return dizi;
		}
			
		public static void main(String[]args) {
		
		
			
		
		


