/*
Sihirli Kare Nedir?

Bir kare matrisin;
Her bir satırındaki sayıların toplamı,
Her bir sütunundaki sayıların toplamı,
Ve her iki köşegenindeki sayıların toplamı... BİRBİRİNE EŞİTSE o matris "Sihirli Kare"dir.

 */
package BirinciSinifAraTatil;

import java.util.Scanner;

public class SihirliKare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kare uzunlugu? : ");
        int n = input.nextInt();

        int[][] kare = new int[n][n];

        for (int i = 0; i < kare.length; i++) {
            for (int j = 0; j < kare[0].length; j++) {
                System.out.print((i + 1) + " .Satir " + (j + 1) + " .Sutun degerini giriniz : ");
                kare[i][j] = input.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < kare.length; i++) {
            for (int j = 0; j < kare[0].length; j++) {
                System.out.print(kare[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        int kosegen1Toplam = 0;
        int kosegen2Toplam = 0;
        int[] satirToplam = new int[n];
        int[] sutunToplam = new int[n];
        for (int i = 0; i < kare.length; i++) {
            for (int j = 0; j < kare[0].length; j++) {
                satirToplam[i] += kare[i][j];
                sutunToplam[i] += kare[j][i];
                if (i == j) {
                    kosegen1Toplam += kare[i][i];
                }
                if (i + j == n - 1) {
                    kosegen2Toplam += kare[i][j];
                }
            }
        }

        for (int i = 0; i < kare.length; i++) {
            System.out.println((i + 1) + ". satir toplami : " + satirToplam[i]);
            System.out.println((i + 1) + ". sutun toplami : " + sutunToplam[i]);
            System.out.println();
        }
        System.out.println("1. Kosegen toplami : " + kosegen1Toplam);
        System.out.println("2. Kosegen toplami : " + kosegen2Toplam);
        
        boolean sihirliMi = true;
        int hedefSayi = satirToplam[0];
        
        if (kosegen1Toplam != hedefSayi || kosegen2Toplam != hedefSayi) {
            sihirliMi = false;
        }

        if (sihirliMi) {
            for (int i = 0; i < n; i++) {
                if (satirToplam[i] != hedefSayi || sutunToplam[i] != hedefSayi) {
                    sihirliMi = false;
                    break; // Hatayı bulduğumuz an döngüden çık daha fazla bakmaya gerek yok
                }
            }
        }

        if (sihirliMi) {
            System.out.println("BU BİR SİHİRLİ KARE!");
        } else {
            System.out.println("Bu sıradan bir kare");
        }
    }

}
