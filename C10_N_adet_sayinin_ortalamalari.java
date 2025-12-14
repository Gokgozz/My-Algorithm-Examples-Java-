//n elemanli bir dizinin aritmetik geometrik ve harmonik ortamalari , 
// BU DAHA BİTMEDİ DEVAM ET
package A06_diziler_arrays;

import java.util.Scanner;

public class C10_N_adet_sayinin_ortalamalari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac elemanli bir dizi gireceksiniz (n) ? : ");
        int N = input.nextInt();

        int[] dizi = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + ". elemani giriniz : ");
            dizi[i] = input.nextInt();

        }

        double sayi_toplamlari = 0;
        double aritmetik = 0;
        for (int i = 0; i < N; i++) {
            sayi_toplamlari += dizi[i];

        }
        aritmetik = sayi_toplamlari / N;

        double sayi_carpimlari = 1;
        double geometrik = 0;
        for (int i = 0; i < N; i++) {
            sayi_carpimlari *= dizi[i];

        }
        geometrik = Math.pow(sayi_carpimlari, 1.0/N);

        double harmonik_payda_toplam = 0;
        double harmonik = 0;
        for (int i = 0; i < N; i++) {
            harmonik_payda_toplam += (1.0 / dizi[i]);
        }
        harmonik = N / harmonik_payda_toplam;

        System.out.println("Aritmetik ortalama : " + aritmetik);
        System.out.println("Geometrik ortalama : " + geometrik);
        System.out.println("Harmonik ortalama : " + harmonik);
        
    }
    
}