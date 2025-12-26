package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A08_tersPiramit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yukseklik : ");
        int yukseklik = input.nextInt();

        for (int i = 0; i < yukseklik; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = yukseklik; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
