// iki vektorun skaler carpimi


package A06_diziler_arrays;

import java.util.Scanner;

public class C06_skaler_carpim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Kac tane vektor gireceksiniz (x,y) ? : ");
        int N = input.nextInt();
        
        int[] vektor1 = new int[N];
        int[] vektor2 = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("1. Vektorun " + (i+1) + ". elemanini giriniz : ");
            vektor1[i] = input.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print("2. Vektorun " + (i+1) + ". elemanini giriniz : ");
            vektor2[i] = input.nextInt();
        }
        
        int skaler_toplam = 0;
        for (int i = 0; i < N; i++) {
            skaler_toplam += vektor1[i] * vektor2[i];
        }
        
        System.out.print("Vektorlerin Skaler Carpimi : " + skaler_toplam);
    }
    
}
