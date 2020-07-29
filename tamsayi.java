package deneme;

class tamsayi1 {
			int sayi;
			tamsayi1(){
				sayi=1;
			}
			tamsayi1(int s){
				sayi=s;
			}
			boolean tekmi() {
				if(sayi%2==1) return true;
				else return false;
			
			}
						boolean asalmi() {
							boolean asal=true;
							for(int i=2;i<=sayi/2;i++) {
								if(sayi%i==0) {
									asal=false;break;
								}
						
							}
							return asal;
						}
			int basamaksay() {
				int say=0;
				while(sayi>0) {
					sayi=sayi/10;
					say++;}
				return say;
				}
			
}

			public class tamsayi {
				
			
				public static void main(String[]args) {
				tamsayi1 c=new tamsayi1(125);
				System.out.println(c.tekmi());
				
				
				
			}     
				
} 


			
			
