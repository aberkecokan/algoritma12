

	class cember{
		double yaricap;
		public cember() {
			yaricap=1.0;
			
		}
		
		cember(double nr){
			yaricap=nr;
		}
		double alanHesap() {
			return Math.PI*yaricap*yaricap;
			
		}
		double cevre() {
			return 2*Math.PI*yaricap;
		}
	}
			public class siniflar{
				public static void main(String []args) {
					cember c1=new cember(15.8);
					System.out.println("Yar��ap:"+c1.yaricap);
					System.out.println("Alan:"+c1.alanHesap());
					c1.yaricap=5;
					System.out.println("Alan:"+c1.alanHesap());
					System.out.println("�evre:"+c1.cevre());
				}
			}
	
	
