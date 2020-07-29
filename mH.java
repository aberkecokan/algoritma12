package abc;

public class mH {
				public static int[] dizim(int[]dizi1,int[]dizi2) {
					int[] aynýdizi=new int[5];
					for(int i=0;i<dizi1.length();i++) {
						if(dizi1[i]==dizi2[i]) {
							aynýdizi[i]=dizi1[i];
						}
							
							
							
							
					}
				
					return aynýdizi;
					
					
				}
				public static void main(String[]args) {
					int []dizicik1= {1,2,3,4,5};
					int []dizicik2= {2,3,4,4,5};
					int[]berkecik=new int[5];
					berkecik=dizim(dizicik1,dizicik2);
					for(int x=0;x<5;x++) {
					System.out.println(berkecik[x]);
				}
}}
