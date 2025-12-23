// SORU : Dizideki indexi kaydırma (Kaydırma sayısını ve diziyi kullanıcıdan alacağız.)
// 1,2,3,4 ----> 4,1,2,3 ----> 3,4,1,2 ----> 2,3,4,1 ----> 1,2,3,4
package A000_denemelerim;

import java.util.Scanner;

public class arrayIndexKaydirma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac elemanli dizi olacak : ");
        int N = input.nextInt();

        int[] original = new int[N];

        for (int i = 0; i < original.length; i++) {
            System.out.println((i + 1) + ". sayiyi giriniz");
            original[i] = input.nextInt();
        }

        int[] temp_original = original.clone(); // original.clone(); diziyi kopyalamak için kullanılır!!

        System.out.print("Dizi kac basamak saga kayacak? : ");
        int userShiftRight = input.nextInt();
        int shiftRight = userShiftRight % original.length;

        for (int i = 0; i < N; i++) {
            // Orijinal dizideki i. elemanın yeni yerini hesaplıyoruz
            int newIndex = (i + shiftRight) % N;
            temp_original[newIndex] = original[i];
        }
        
        System.out.print("Dizinin orijinal hali : ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        
        System.out.print("Dizinin "+ userShiftRight +" defa saga kaydirilmis hali : ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(temp_original[i] + " ");
        }
    }

}
