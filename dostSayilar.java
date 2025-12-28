package finalCalismalarim;

import java.util.Scanner;

public class dostSayilar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("2. sayiyi giriniz : ");
        int sayi2 = input.nextInt();

        //1. nin tam bölenlerinin toplamını bulacağım
        int bolenToplam1 = 0;
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                bolenToplam1 += i;
            }
        }

        //2. nin tam bölenlerinin toplamını bulacağım
        int bolenToplam2 = 0;
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                bolenToplam2 += i;
            }
        }

        if (sayi1 % bolenToplam2 == 0 && sayi2 % bolenToplam1 == 0) {
            System.out.println("Bu sayilar dost sayilardir.");
        } else {
            System.out.println("Degildir.");
        }
    }

}
