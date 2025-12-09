//n tane elemanli dizinin eb ve ek elemanlar dizinin hangi indisli elemanlaridir bul
package A06_diziler_arrays;

import java.util.Scanner;

public class C08_EBveEk_indis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac elemanli dizi olusturacaksiniz(N) ? : ");

        int N = input.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". Sayiyi giriniz : ");
            array[i] = input.nextInt();

        }
        
        
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        
        System.out.println();
        System.out.println("Min sayi : " + min + " Min sayinin bulundugu index : " + minIndex);
        System.out.println("Max sayi : " + max + " Max sayinin bulundugu index : " + maxIndex);

    }

}
