package metot;

public class metot1 {

    public static void main(String[] args) {

        int dizi[] = {2, 9, 7, -4, -6, 1};

        int enkucuk, yedek;

        for (int i = 0; i < 6; i++) {

            enkucuk = i;

            for (int j = i + 1; j < 6; j++) {

                if (dizi[j] < dizi[enkucuk]) {

                    enkucuk = j;
                }
            }
            if (enkucuk != i) {

                yedek = dizi[i];

                dizi[i] = dizi[enkucuk];

                dizi[enkucuk] = yedek;

            }

        }

//       for (int i : dizi) {

//            System.out.print(dizi[i + " "]);

//       }
for (int i = 0; i <6; i++) {
    System.out.print(" "+dizi[i]);
            
        }
           
        }
    }
