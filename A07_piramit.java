/*

----*-
---*-*-
--*-*-*-
-*-*-*-*-

*/
package forDongusuYildizOrnekleri;

import java.util.Scanner;

public class A07_piramit {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yukseklik : ");
        int yukseklik = input.nextInt();
        
        for (int i = 0; i < yukseklik; i++) {
            
            for (int j = 0; j < (yukseklik - i - 1); j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < (i+1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
