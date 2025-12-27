package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A10_paralelkenar {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Yukseklik giriniz : ");
        int yukseklik = input.nextInt();
        
        System.out.println("Uzunluk giriniz : ");
        int uzunluk = input.nextInt();
        
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < yukseklik-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < uzunluk; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
