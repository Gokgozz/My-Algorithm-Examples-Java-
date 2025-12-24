package A000_denemelerim;

import java.util.Scanner;

public class matrisinTranspozuSimetrikMi {

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

        boolean simetrikMi = true;
        if (satir != sutun) {
            simetrikMi = false;
            System.out.println("Matris ve Transpozu simetrik degildir.");
            
        } else {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    if (original[i][j] != transpoz[i][j]) {
                        simetrikMi = false;
                        break;
                    }

                }

            }
        }
        if (simetrikMi) {
            System.out.println("\nSONUÇ: Matris ve Transpozu SİMETRİKTİR."); // \n (Backslash n), yazılım dünyasında "New Line" (Yeni Satır) anlamına gelir.
        } else {
            System.out.println("\nSONUÇ: Matris ve Transpozu simetrik DEĞİLDİR.");
        }
    }

}
