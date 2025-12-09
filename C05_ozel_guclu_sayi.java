//disaridan alinan bir sayinin basamaklarinin faktoriyelleri toplami kendisine esit olan ozel sayi kontrolunu yapan program

package A06_diziler_arrays;

import java.util.Scanner;

public class C05_ozel_guclu_sayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int N = input.nextInt();

        while (N < 0) {
            System.out.print("Lutfen 0'dan buyuk bir N degeri giriniz : ");
            N = input.nextInt();
        }

        int tempN = N;
        int basamakN = 1;

        if (N > 0) {
            while (tempN >= 10) {
                tempN = tempN / 10;
                basamakN++;
            }
        }

        int[] diziN = new int[basamakN];

        int sayiKopyasi = N;
        int index = basamakN - 1;

        while (sayiKopyasi > 0) {
            
            int sonBasamak = sayiKopyasi % 10;
            
            diziN[index] = sonBasamak;
            
            sayiKopyasi = sayiKopyasi / 10;
            
            index--;
        }

        
        long faktoriyelToplam = 0;
        for (int i = 0; i < diziN.length; i++) { 
            
            int basamakDegeri = diziN[i];
            
            long faktoriyel = 1;
            
            for (int j = 2; j <= basamakDegeri; j++) { // Faktöriyel Hesaplama
                faktoriyel *= j;
            }

            faktoriyelToplam += faktoriyel;
        }

        System.out.println();
        System.out.println("Basamak Faktoriyel Toplami: " + faktoriyelToplam);

        if (faktoriyelToplam == N) {
            System.out.println(N + " sayisi, basamaklarinin faktoriyel toplami kendisine esit olan OZEL/GUCLU bir sayidir.");
        } else {
            System.out.println(N + " sayisi ozel/guclu bir sayi DEGILDIR.");
        }

    }

}
