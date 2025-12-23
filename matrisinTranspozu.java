package A000_denemelerim;

import java.util.Scanner;

public class matrisinTranspozu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisini giriniz : ");
        int satir = input.nextInt();
        System.out.print("Sutun sayisini giriniz : ");
        int sutun = input.nextInt();

        int[][] original = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println((i + 1) + ". Satir " + (j + 1) + ". Sutun degerini giriniz : ");
                original[i][j] = input.nextInt();
            }

        }

        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                transpoz[i][j] = original[j][i];

            }

        }

        System.out.println("TRANSPOZ MATRIS (satir ve sutunlar birbirinin yerine gecti) : ");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + "\t");

            }
            System.out.println();
        }

    }

}
