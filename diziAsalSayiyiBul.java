package A000_denemelerim;

import java.util.Scanner;

public class diziAsalSayiyiBul {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int asalSayiAdet = 0;
        int asalOlmayanSayiAdet = 0;
        String asalSayilar = " ";
        String asalOlmayanSayilar = " ";

        System.out.println("Dizi kac elemanli olacak? : ");
        int N = input.nextInt();
        int[] sayilar = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + ". sayiyi giriniz: ");
            sayilar[i] = input.nextInt();
        }

        for (int sayi : sayilar) {
            if (sayi < 2) { // 0 ve 1 asal değildir
                asalOlmayanSayiAdet++;
                asalOlmayanSayilar += sayi + " ";
                continue;
            }

            boolean asalMi = true;
            for (int j = 2; j < sayi; j++) {
                if (sayi % j == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                asalSayiAdet++;
                asalSayilar += sayi + " ";
            } else {
                asalOlmayanSayiAdet++;
                asalOlmayanSayilar += sayi + " ";
            }
        }

        System.out.println("Asal sayi adeti : " + asalSayiAdet);
        System.out.println("Asal olmayan sayi adeti : " + asalOlmayanSayiAdet);
        System.out.println("Asal olan sayilar : " + asalSayilar);
        System.out.println("Asal olmayan sayilar : " + asalOlmayanSayilar);

    }

}
