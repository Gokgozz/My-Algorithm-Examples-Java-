package finalCalismalarim;

import java.util.Scanner;

public class kacTekKacCift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sayi giriniz : ");
        int sayi = input.nextInt();
        sayi = Math.abs(sayi); //Negatif girilse bile pozitife çevirir (Mutlak Değer)

        int tekAdet = 0;
        int ciftAdet = 0;

        if (sayi == 0) {
            ciftAdet = 1;
        }

        while (sayi > 0) {
            int basamak = sayi % 10;
            if (basamak % 2 == 0) {
                ciftAdet++;
            } else {
                tekAdet++;
            }
            sayi = sayi / 10;
        }
        System.out.println("Tek rakam adeti : " + tekAdet);
        System.out.println("Cift rakam adeti : " + ciftAdet);

    }

}
