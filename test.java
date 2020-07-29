		interface konus{
			String getAd();
			String merhaba();
		}
		
		abstract class insan implements konus{
			private final String ad;
			protected insan(String pad) {
				this.ad=pad;
			}
		
		public String getAd() {
			return this.ad;
		}}
		
		class Turk extends insan{
			public Turk(String pad) {
				super(pad);
				
			}
			public String merhaba() {
				return "merhaba";
			}
			
		}
		class Ingiliz extends insan{
			public Ingiliz(String pad) {
				super(pad);
				
			}
			public String merhaba() {
				return "ABC";
			}
		}
public class test {
					public static void main(String[]args) {
						insan a=new Turk("ahmet");
						System.out.println(a.getAd());
						System.out.println(a.merhaba());
					}
}
