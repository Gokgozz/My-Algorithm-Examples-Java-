package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A05_sagaDayaliYarimDikUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yukseklik giriniz : ");
        int yukseklik = input.nextInt();

        for (int i = 0; i < yukseklik; i++) { //satır sayısı için

            for (int j = 0; j < yukseklik - i; j++) { // boşluk sayısı için yaptım.
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { // yıldız sayısı için yaptım.
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
