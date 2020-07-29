package abc;
import java.util.Scanner;
public class sinav4 {
       

		public static void main(String[]args) {
        	 Scanner k=new Scanner(System.in);
        		int[][] matris = new int[2][2];
           	 int[][] matris2=new int[2][2];
           	 int [][]toplam=new int [2][2];
        	 for(int a=0;a<2;a++) {
        		 for(int b=0;b<2;b++) {
        			 matris[a][b]=k.nextInt();
        			 matris2[a][b]=k.nextInt();
        			 
        		 }
        		 
        	 }
        	 
        	 
        
        	 
        	 
        	 
        	 
        	 for(int i =0;i<2;i++) {
        		 for(int j=0;j<2;j++) {
        			 toplam[i][j]=matris[i][j]+matris2[i][j];
        					 
        		 }
        		 
        	 }
        	 
        	for(int k1=0;k1<2;k1++) {
        		        	 for(int x=0;x<2;x++) {
        		 System.out.println(toplam[k1][x]);
        	 }
        		
        	}
         }
}
