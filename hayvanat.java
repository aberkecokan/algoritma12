

	interface hayvan{
		public void avlan();
	}
		abstract class Kedi implements hayvan{
			public abstract void takipet();
			
		}
		class kaplan extends Kedi{
				public void avlan(){
					System.out.println("Kaplan Avlanýyor");
				}
				public void takipet() {
					System.out.println("Çok güzel takip ediyor");
				}
		}

public class hayvanat {
	public static void main(String[]args) {
		kaplan a=new kaplan();
		a.avlan();
		a.takipet();
	}
		
}
