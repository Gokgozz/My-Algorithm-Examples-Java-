// Bir sayı armstrong sayısı mı? değil mi?
// basamaklarının küplerinin toplamı o sayıya eşit ise öyledir

package uni_dersleri_vize_sonrasi;

import java.util.Scanner;

public class A10_armstrong_sayisi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi giriniz : ");
        int N = input.nextInt();
        
        int original_number = N; // N'in orijinal değerini korumak için kopyalıyoruz.
        int sum_of_cubes = 0; // Küplerin toplamını tutacak değişkeni sıfırlıyoruz.
        int digit; // Basamağı geçici olarak tutacak değişken. (digit : basamak)
        
        int temp = N; // Hesaplama için N'in geçici bir kopyası (çünkü N'i değiştireceğiz)
        
        while (temp > 0) {
            digit = temp % 10;                     // Son basamağı bul (Örn: 153 -> 3)
            sum_of_cubes += digit * digit * digit; // Küpünü toplama ekle (Örn: 0 + 27 = 27)
            temp = temp / 10;                      // Son basamağı at (Örn: 153 -> 15)
        }
        
        if(sum_of_cubes == original_number){
            System.out.print(original_number + " bir Armstrong sayisidir.");
        }else{
            System.out.println(original_number + " bir Armstrong sayisi degildir.");
        }
    
        
        
        
    }
    
}