

	interface hayvan{
		public void avlan();
	}
		abstract class Kedi implements hayvan{
			public abstract void takipet();
			
		}
		class kaplan extends Kedi{
				public void avlan(){
					System.out.println("Kaplan Avlan�yor");
				}
				public void takipet() {
					System.out.println("�ok g�zel takip ediyor");
				}
		}

public class hayvanat {
	public static void main(String[]args) {
		kaplan a=new kaplan();
		a.avlan();
		a.takipet();
	}
		
}
