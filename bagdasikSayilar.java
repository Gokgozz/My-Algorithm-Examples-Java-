package finalCalismalarim;

import java.util.Scanner;

public class bagdasikSayilar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. sayiyi giriniz (iki basamakli) :");
        int sayi1 = input.nextInt();
        while(sayi1<10 || sayi1>99){
            System.out.println("iki basamakli sayi giriniz : ");
            sayi1 = input.nextInt();
        }
        System.out.println("2. sayiyi giriniz (iki basamakli) :");
        int sayi2 = input.nextInt();
        while(sayi2<10 || sayi2>99){
            System.out.println("iki basamakli sayi giriniz : ");
            sayi2 = input.nextInt();
        }
        
        
        if (sayi1%10 + sayi2%10 == 10 && sayi1/10 == sayi2/10){
            System.out.println("Bagdasik sayidir.");
        }else{
            System.out.println("degildir");
        }
        
    }
    
}
