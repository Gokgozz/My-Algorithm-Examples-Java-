package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A11_iciBosKare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kenar uzunlugu giriniz : ");
        int kenar = input.nextInt();

        for (int i = 0; i < kenar; i++) { 
            for (int j = 0; j < kenar; j++) {

                // Sınırda mıyız? (İlk satır, Son satır, İlk sütun, Son sütun)
                if (i == 0 || i == kenar - 1 || j == 0 || j == kenar - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Değilse boşluk
                }
            }
            System.out.println();
        }
    }

}
