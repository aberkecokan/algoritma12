package abc;

public class sinav2 {

	
	public static int kactane(int matris[][]) {
		int enkucuk=matris[0][0];
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[0].length;j++) {
				if(enkucuk>matris[i][j]) {
					enkucuk=matris[i][j];
					
				}
				
			}
			
		}
		return enkucuk;
		
	}
	 public static void main(String[]args) {
		 int [][] matris1=new int[4][4];		
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					matris1[i][j]=6-i;
					
			}
		}
			
			System.out.println(kactane(matris1));
	 }
	
	
	
	
}
