// hilbert sayısı : 4k+1 : 1 5 9 13 17 21
package finalCalismalarim;

import java.util.Scanner;

public class hilbertSayisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        int sayi = input.nextInt();
        
        if((sayi-1) % 4 == 0){
            System.out.println("hilbert sayidir");
        }else{
            System.out.println("degildir.");
        }
    }

}
