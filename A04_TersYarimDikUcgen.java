package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A04_TersYarimDikUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kenar uzunlugu : ");
        int yukseklik = input.nextInt();

        for (int i = yukseklik; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
