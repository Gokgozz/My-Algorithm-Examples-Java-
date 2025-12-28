package finalCalismalarim;

import java.util.Scanner;

public class harshadSayisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sayi giriniz : ");
        int sayi = input.nextInt();
        
        int tempSayi = sayi;
        int basamaklarToplami = 0;
        int sonBasamak;
        
        while(tempSayi>0){
            sonBasamak = tempSayi % 10;
            basamaklarToplami += sonBasamak;
            tempSayi = tempSayi/10;
        }
        
        if(sayi%basamaklarToplami == 0){
            System.out.println("Bu sayi harshad sayisidir.");
        }else{
            System.out.println("Bu sayi harshad sayisi degildir");
        }
    }

}
