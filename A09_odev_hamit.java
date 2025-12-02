package uni_dersleri_vize_sonrasi;

import java.util.Scanner;

public class A09_odev_hamit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol edilecek pozitif tamsayiyi giriniz: ");
        int N = input.nextInt();
        
        int number = N; // Hesaplama için N'in kopyasını alıyoruz.
        
        //Bir sayının 2, 3 ve 5'ten başka asal böleni olmadığını kanıtlamanın yolu,
        //ayıyı defalarca bu üç asal sayıya bölmek ve bu işlemlerden sonra geriye bir şey kalıp kalmadığını kontrol etmektir.
        
        if (number <= 0){
            System.out.println("Lutfen pozitif bir tamsayi giriniz.");
            return;
        }
        
        while (number % 2 == 0) {
            number = number / 2;
        }

        while (number % 3 == 0) {
            number = number / 3;
        }

        while (number % 5 == 0) {
            number = number / 5;
        }
        
        if (number == 1) {
            System.out.println(N + " bir Hamit sayisidir.");
        } else {
            System.out.println(N + " bir Hamit sayisidir degildir.");
        }
        
    }
}