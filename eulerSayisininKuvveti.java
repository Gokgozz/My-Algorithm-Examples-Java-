package finalCalismalarim;

import java.util.Scanner;

public class eulerSayisininKuvveti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int N = input.nextInt();
        double toplam = 0;
        int fakt = 1;
        for (int n = 0; n <= N; n++) {
            if (n == 0) {
                fakt = 1;
            } else {
                fakt *= n;
            }
            toplam += Math.pow(x, n) / fakt;
        }
        System.out.println("e^x = " + toplam);
    }

}
