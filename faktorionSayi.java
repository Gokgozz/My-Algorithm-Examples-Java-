package finalCalismalarim;

import java.util.Scanner;

public class faktorionSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi : ");
        int sayi = input.nextInt();
        int sayicopy = sayi;
        int genelToplam = 0;

        while (sayi > 0) {
            int sonBasamak = sayi % 10;
            int anlikFaktoriyel = 1;
            for (int i = 1; i <= sonBasamak; i++) {
                anlikFaktoriyel *= i;
            }
            genelToplam += anlikFaktoriyel;
            sayi = sayi / 10;
        }
        
        if (genelToplam == sayicopy) {
            System.out.println(sayicopy + " faktorion sayidir.");
        } else {
            System.out.println(sayicopy + " degildir.");
        }

    }

}
