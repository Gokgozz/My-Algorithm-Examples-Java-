package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A12_carpiXsekli {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Uzunluk : ");
        int kenar = input.nextInt();
        
        for (int i = 0; i < kenar; i++) { 
            for (int j = 0; j < kenar; j++) {

                
                if (i == j || i + j == kenar - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
