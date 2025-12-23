package A000_denemelerim;

import java.util.Scanner;

public class ikiBoyutluDiziOgreniyorum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisini giriniz : ");
        int satir = input.nextInt();

        System.out.print("Sutun sayisini giriniz : ");
        int sutun = input.nextInt();

        //int[][] matris = new int[satir][sutun];
        int[][] matris = new int[satir][sutun];

        for (int i = 0; i < satir; i++) { // Satırları gezer
            for (int j = 0; j < sutun; j++) { // Sütunları gezer
                System.out.print((i + 1) + ". Satir " + (j + 1) + ". Sutun degerini girin: ");
                matris[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + "\t");

            }
            System.out.println(); // satır bittikten sonra yeni satıra geçmek için (alt satıra indiriyor)
        }

        System.out.println();

        // şimdi kullanıcının vereceği koordinattaki sayıyı -1 ile değiştireceğim
        System.out.println("Hangi satir? : ");
        int x = input.nextInt();
        while (x > satir || x <= 0) {
            System.out.println("Gecerli satir sayisi giriniz : ");
            x = input.nextInt();
        }
        System.out.println("Hangi sutun? : ");
        int y = input.nextInt();
        while (y > sutun || y <= 0) {
            System.out.println("Gecerli sutun sayisi giriniz : ");
            y = input.nextInt();
        }
        matris[x - 1][y - 1] = -1;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + "\t");

            }
            System.out.println();
        }

    }

}
