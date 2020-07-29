
	class bisiklet{
		int vitessayisi;
		int hiz;
		 bisiklet(int vitessayisi,int hiz) {
			this.vitessayisi=vitessayisi;
			this.hiz=hiz;
		}
		void hizlan(int artis) {
			hiz+=artis;
		}
		void frenyap(int azalt) {
			hiz-=azalt;
		}
	}

			class dagbisikleti extends bisiklet{
				int oturmayukseklik;
			public dagbisikleti(int oturmayukseklik,int vitessayisi,int hiz) {
				super(vitessayisi, hiz);
				this.oturmayukseklik=oturmayukseklik;
				
			}
			public void setoturmayukseklik(int oturmayukseklik) {
					this.oturmayukseklik=oturmayukseklik;
			}
			}


public class kalitimornek {
	public static void mian(String[]args) {
		dagbisikleti db=new dagbisikleti(30,12,5);
		db.hizlan(5);
		System.out.println(db.hiz);
		db.frenyap(3);
		System.out.println(db.hiz);
		System.out.println(db.vitessayisi);
		
	}
	
}
