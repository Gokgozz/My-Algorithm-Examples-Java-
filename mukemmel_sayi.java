//POZİTİF TAM BÖLENLERİNİN TOPLAMI KENDİSİNE EŞİT OLAN SAYI MÜKEMMEL SAYIDIR (KENDİSİ HARİÇ)
//DIŞARIDAN BİR SAYI AL. MÜKEMMEL Mİ? DEĞİL Mİ?

package A000_denemelerim;

import java.util.Scanner;

public class mukemmel_sayi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi Giriniz : ");
        
        int sayi = input.nextInt();
        int bolenToplam = 0;
        
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                bolenToplam = bolenToplam + i;
            }
            
        }
        int sonuc = bolenToplam - sayi;
        
        if (sonuc == sayi){
            System.out.print("Mukemmel sayidir.");
        }else{
            System.out.print("Mukemmel sayi degildir.");
            
        }
        
    }
    
}
