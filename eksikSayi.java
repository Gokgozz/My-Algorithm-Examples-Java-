package finalCalismalarim;

import java.util.Scanner;

public class eksikSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("sayi : ");
        int sayi = input.nextInt();
        int tamBolenToplam = 0 ;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                tamBolenToplam += sayi;
            }
        }
        
        if(sayi*2 > tamBolenToplam){
            System.out.println("Eksik sayidir.");
        }else{
            System.out.println("Degildir.");
        }
        
    }
    
}
