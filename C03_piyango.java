// 6 tane rastgele , 1-49 arasında sayı üret. Kullanıcıdan 6 sayı iste ve kullanıcının kaç sayıyı doğru bildigini yaz (çıkmış soru)

package A06_diziler_arrays;

import java.util.Scanner;
import java.util.Random;

public class C03_piyango {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomUretici = new Random();


        int[] kullanici_sayilari = new int[6];
        int[] random_sayilar = new int[6];
        
        
        for (int i = 0; i < random_sayilar.length; i++) { // Döngü ile dizinin her elemanına rastgele sayı atanır
            
            int rastgeleSayi = randomUretici.nextInt(49) + 1; // nextInt(bound) metodu 0 (dahil) ile bound (hariç) arasında bir sayı üretir.
            random_sayilar[i] = rastgeleSayi;                 // [0, 48] aralığında sayı üretmek için nextInt(49) kullanılır.
        }                                                     // [1, 49] aralığı için ise 1 eklenir.
        
        System.out.println();
        System.out.print("----MAKU PIYANGOYA HOSGELDINIZ----");
        System.out.println();
        System.out.print("3 ve uzeri dogru tahminde buyuk ikramiye sizin!!! (1,000,000 TL!!!)");
        System.out.println();
        
        
        System.out.println();
        System.out.print("Tahmin ettiginiz sayilari giriniz [1,49] : ");
        System.out.println();
        
        for (int i = 0; i < 6; i++) {
            System.out.print((i+1) +". Sayi tahmini : ");
            kullanici_sayilari[i] = input.nextInt();
            while(kullanici_sayilari[i]>49){
                System.out.print("LUTFEN [1,49] ARALIGINDA BIR TAHMIN YAPINIZ : ");
                kullanici_sayilari[i] = input.nextInt();
            }
            
        }
        
        int dogru_tahmin_sayisi = 0;
        for (int i = 0; i < 6; i++) {  //iç içe for kullanma sebebim random ve kullanıcı sayısını tüm değerlerle karşılaştırmak
            for (int j = 0; j < 6; j++) {
                
                if (kullanici_sayilari[i] == random_sayilar[j]) {
                    dogru_tahmin_sayisi++; 
                    break; 
                }
            }
        }
        
        System.out.println();
        System.out.print("---SONUCLAR---");
        System.out.println();
        
        System.out.print("Tahmin ettiginiz sayilar : " );
        for (int i = 0; i < 6; i++) {
            System.out.print(kullanici_sayilari[i] + "  ");
        }
        
        System.out.println();
        System.out.print("Random uretilen sayilar : " );
        for (int i = 0; i < 6; i++) {
            System.out.print(random_sayilar[i] + "  ");
        }

        System.out.println();
        System.out.print("Dogru tahmin sayisi : " + dogru_tahmin_sayisi);
        System.out.println();
        System.out.println();
        
        if(dogru_tahmin_sayisi >= 3){
            System.out.print("TEBRIKLER! Kazandiniz.");
        }else{
            System.out.print("Malesef kazanamadiniz...");
        }
        
    }
    
}
