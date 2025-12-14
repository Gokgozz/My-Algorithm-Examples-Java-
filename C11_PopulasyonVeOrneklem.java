//klavyeden girilen bir dizinin standart sapmasi ve varyantinin hesaplanmasi
package A06_diziler_arrays;

import java.util.Scanner;

public class C11_PopulasyonVeOrneklem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz? : ");
        int sayi = input.nextInt();
        int[] dizi = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.print((i + 1) + ". Sayiyi giriniz : ");
            dizi[i] = input.nextInt();
        }

        int toplam = 0;
        for (int i = 0; i < sayi; i++) {
            toplam += dizi[i];

        }
        double ortalama = (double) toplam / sayi;

        double[] dizi2 = new double[sayi];
        double farkkare = 0;
        for (int i = 0; i < sayi; i++) {
            dizi2[i] = ((dizi[i] - ortalama) * (dizi[i] - ortalama));
        }

        double toplam2 = 0;
        for (int i = 0; i < sayi; i++) {
            toplam2 += dizi2[i];
        }

        double population = (double) toplam2 / sayi;
        double orneklem = (double) toplam2 / (sayi - 1);
        double standart_sapma_population = Math.sqrt(population);
        double standart_sapma_orneklem = Math.sqrt(orneklem);

        System.out.println("Populasyon Standart Sapmasi : " + standart_sapma_population);
        System.out.println("Orneklem Standart Sapmasi : " + standart_sapma_orneklem);
    }

}
