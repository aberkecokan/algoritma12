package paket2;

public class s�n�f1 {
	public int x ;
				int y;
				private int z;
				public s�n�f1() {
					x=1;
					y=1;
					z=1;
							
				}
				public s�n�f1(int x1,int y1,int z1) {
					x=x1;
					y=y1;
					z=z1;
							
				}
				
				
				
				public int enbbul() {
					int eb=x;
					if(y>eb)
						eb=y;
					if(z>eb) 
						eb=z;
					return eb;
				}
				
				public int enkbul() {
					int ek=x;
					if(y<ek)
						ek=y;
					if(z<ek)
						ek=z;
					return ek;
				}
				private void selam() {
					System.out.println("Merhaba");
				}
				
}
