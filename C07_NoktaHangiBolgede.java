//klavyeden girilen n adet nokta ciftinin kartezyen koordinat sisteminde kacinci bolgede olduklarini bul
package A06_diziler_arrays;

import java.util.Scanner;

public class C07_NoktaHangiBolgede {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac adet nokta cifti gireceksiniz ? : ");
        int N = input.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.print((i + 1) + ". Noktanin X degerini giriniz : ");
            x[i] = input.nextInt();

            System.out.print((i + 1) + ". Noktanin Y degerini giriniz : ");
            y[i] = input.nextInt();

        }

        for (int i = 0; i < N; i++) {
            if (x[i] > 0 && y[i] > 0) {
                System.out.println((i + 1) + ".Nokta 1. bolgededir");
            }
            else if (x[i] < 0 && y[i] > 0) {
                System.out.println((i + 1) + ".Nokta 2. bolgededir");
            }
            else if (x[i] < 0 && y[i] < 0) {
                System.out.println((i + 1) + ".Nokta 3. bolgededir");
            }
            else if (x[i] > 0 && y[i] < 0) {
                System.out.println((i + 1) + ".Nokta 4. bolgededir");
            }
            else if (x[i] == 0 && y[i] == 0) {
                System.out.println((i + 1) + ".Nokta orijindir");
            }
            else if (x[i] == 0 && y[i] != 0) {
                System.out.println((i + 1) + ".Nokta Y ekseni ustundedir");
            }
            else if (y[i] == 0 && x[i] != 0) {
                System.out.println((i + 1) + ".Nokta X ekseni ustundedir");
            }
        }

    }

}
