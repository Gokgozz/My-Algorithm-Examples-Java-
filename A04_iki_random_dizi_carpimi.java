package A01_metotlar;

import java.util.Random;

public class A04_iki_random_dizi_carpimi {
    
    public static void random_numbers(int[] a){
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100);
        }
    }
    
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
    
    public static void ew_multip(int[] a , int[] b , int[] c){ //vektorleri carpiyoruz
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i]*c[i];
        }
    }
    
    public static void main(String[] args) {
        
        int[] vektor1 = new int[5];
        int[] vektor2 = new int[5];
        random_numbers(vektor1);
        random_numbers(vektor2);
        System.out.print("1. ");
        vec_print(vektor1);
        System.out.print("2. ");
        vec_print(vektor2);
        
        int[] vektor3 = new int[5];
        ew_multip(vektor3,vektor2,vektor1);
        System.out.print("Carpim ");
        vec_print(vektor3);
        
        
        
        
    }
    
}
