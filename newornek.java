package abc;

public class newornek {

	public static String [][]karakter(String [][]ab) {
		String a = " ";
		String[][] matris=new String[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(ab[i][j].length()==4){
					matris[i][j]=ab[i][j];	
						
						System.out.println(matris[i][j]+ "  " + " ");
					}
				}
			 
		}
		
			return matris;
	}
	
	
	public static void main(String[]args) {
		String [][];
		
		
		
	}
	
	
}

