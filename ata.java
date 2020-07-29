
public class ata {
	private void m1() {System.out.println("ata m1()");}
	void m2() {System.out.println("ata m2()");}
}
	class cocuk extends ata{
		void m1() {
			System.out.println("Çocuk m1()");}
			@Overrade
			void m2() {System.out.println("Çocuk m2()");{
				
			}}}
				class ornek2{
					public static void main(String[]args) {
						ata obj1=new ata();
						obj1.m2();
						cocuk obj2=new cocuk();
						obj2.m2();
					}
				
			}
		


