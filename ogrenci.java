package paket2;
	class ogrenci1 {
	
		private static int no=1;
		int vize;
		int genel;
		public ogrenci1(int v,int f) {
			no++;
			vize=v;
			genel=f;
		}
		
	public int getno() {
		return no;
	}}
	
		public class ogrenci{
			public static void ogrenciort(int sayi) {
				for(int i =0;i<sayi;i++) {
					int vz=(int) (100*(Math.random(10)));
					int fn=(int)(100*(Math.random(10)));
					ogrenci1 o=new ogrenci1(vz,fn);
							System.out.println(o.getno()+"/t/t"+(int)(o.vize*0.4)+(o.genel*0.6));
				}
					
				
			}
		public static void main(String[]args) {
				//Yazdým;
				ogrenciort(10);
				
			}
		}
