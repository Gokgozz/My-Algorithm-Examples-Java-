package finalCalismalarim;

import java.util.Scanner;

public class tauSayisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sayi : ");
        int sayi = input.nextInt();
        int tamBolenSayisi = 0;
        int temp = sayi;
        
        for (int i = 1; i <= sayi; i++) {
            if(sayi%i==0){
                tamBolenSayisi++;
            }
        }
        
        if(temp%tamBolenSayisi == 0 ){
            System.out.println("TAU sayisidir");
        }else{
            System.out.println("Degildir");
        }
    }
    
}
