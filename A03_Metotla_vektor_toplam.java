
package A01_metotlar;

import java.util.Scanner;
import java.util.Random;

public class A03_Metotla_vektor_toplam {
    
    
    public static void vec_print(int[] a){
        System.out.print("Vektor : [");
        for (int i = 0; i < a.length; i++) {
            if(i == a.length-1){
                System.out.print(a[i] + "]");
            }else{
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
        
    }
    
    public static void vec_assign(int[] a){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1) + ". degeri giriniz : ");
            a[i] = input.nextInt();
        }
        
    }
    
    public static void random_numbers(int[] a){
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(10);
        }
        
    }

    public static void main(String[] args) {
        
        int[] randomDizi = new int[5];
        System.out.print("Random dizi ");
        random_numbers(randomDizi);
        vec_print(randomDizi);
        
        int[] atanmisDizi = new int[5];
        vec_assign(atanmisDizi);
        System.out.print("Atanmis dizi ");
        vec_print(atanmisDizi);
        
        
        int[] x = {5,4,8,6,3};
        System.out.print("X ");
        vec_print(x);
        
        int[] y = {1,5,3,2,8};
        System.out.print("Y ");
        vec_print(y);
        
        int[] zCarpim = new int[5];
        for (int i = 0; i < zCarpim.length; i++) {
            zCarpim[i] = x[i]*y[i];
        }
        System.out.print("Z (Carpim) (x*y) ");
        vec_print(zCarpim);

    }
    
}
