// Metotlar tanımlanmış yapılardır.
// Metot tanımlarken ----> public static + tipi + adı(parametre){
// ... }

// tip nedir? ---> void , int , String , double , float , ... 
// Tip metotun outputuna göre seçilir. yani tam sayı ise int gibi

// Bir metotda void ne zaman kullanılır?
// 1 - metotun outputu yoksa
// 2 - metot bilgi vermek amaçlı kullanılıyorsa
// 3 - metot atama işlemlerinde kullanılıyorsa

// Parametre nedir? = bana ne lazım? sorusunun cevabı parametredir.
// mesela KDV hesaplamak için ürün fiyatı ve kdv oranı gerekir. Bunlar bizim parametrelerimizdir.

// metot bir kalıptır. Biz onu çağırmadan kullanamayız.
// metot içinde metot tanımlanamaz.

package A01_metotlar;

import java.util.Scanner;

public class A01_metot_nedir {
    
    // Buraya metot yazabiliriz.
    public static void topla(int sayi1, int sayi2){
        int result = sayi1 + sayi2;
        System.out.println("Sonuc(result) = " + result);
    }
    
    public static void ondalikToplam(double Osayi1 , double Osayi2 , double Osayi3){
        double ondalikResult = Osayi1 + Osayi2 + Osayi3;
        System.out.println("Ondalik sayi toplami : " + ondalikResult);
    }
    
    // Programı çalıştıran birim.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        
        topla(A,B); // burada topla metotunu çağırdık. sayi1 = A , sayi2 = B oldu
        topla(3,5); // kendimiz de değer verebiliriz. metotu çok kez çağırabiliriz.
        
        ondalikToplam(1.2 , 2.7 , 4.50);
    }
    
    // Buraya da metot yazabiliriz.
    
    
}