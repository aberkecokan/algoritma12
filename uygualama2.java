package paket2;
			class cember{
				private double r;
				private static int nsay=0;
				cember(){
					r=1;
					nsay++;
				}
			
			cember(double nr){
			nsay++;
			r=nr;
			}
			
			public void setr(double nr) {
				if(nr>0)r=nr;
			}
			public double getr() {
				return r;
			}
			public int nesnesayisi() {
				return nsay;
			}
			public double alanHesap() {
				return Math.PI*r*r;
			}}
public  class uygualama2 {
	public static void cemberyaz(cember c) {
		System.out.println(c.getr()+"yarýçaplý çemberkin alaný:"+c.alanHesap());
		System.out.println("Nesne Sayýsý:"+c.nesnesayisi());
	}
	
	public static void cemberalan(cember c,int say) {
		System.out.println("Yarýçap/t/tAlan");
		for(int i=0;i<say;i++) {
			System.out.println(c.getr()+"/t/t"+c.alanHesap());
			c.setr(c.getr()+1);
		}
	}
	
	public static void main(String[] args){
		cember c1=new cember(2.4);
		cemberyaz(c1);
		cember c2=new cember(24);
		cemberalan(c2,5);
	}
}
