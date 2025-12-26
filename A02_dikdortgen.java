package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A02_dikdortgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenar uzunlugu: ");
        int kenar1 = input.nextInt();
        System.out.print("2. kenar uzunlugu: ");
        int kenar2 = input.nextInt();

        for (int i = 0; i < kenar1; i++) {
            for (int j = 0; j < kenar2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
