package deneme;

public class rasyonel {
		int pay;
		int payda;
		
		
	public rasyonel() {
		pay=1;
		payda=1;
			
	}
	public rasyonel(int py,int pd) {
		pay=py;
		payda=pd;
		
		
	}
	void goster() {
		System.out.println(pay+"/"+payda);
	}
	static int ebob(int a,int b) {
		int kucuk;
		if(a>b) kucuk=a;
		else kucuk=b;
		int eb=1;
		for(int i=kucuk;i>1;i--) {
			if(a%i==0 && b%i==0) {
				eb=i; 
				break;
			}
		}
	return eb;
	}
	void sadelestir() {
		int e=ebob(pay,payda);
		pay=pay/e;
		payda=payda/e;
		
		}
	public static void main(String[]args) {
		
	System.out.println(ebob(9,15));	
		rasyonel r=new rasyonel(18,24);
		r.goster();
		r.sadelestir();
		System.out.println("pay:"+r.pay+" "+"payda:"+r.payda);
		
	}
}
