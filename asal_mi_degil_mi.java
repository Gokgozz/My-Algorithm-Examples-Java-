package A000_denemelerim;

import java.util.Scanner;

public class asal_mi_degil_mi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sayi giriniz : ");
        int sayi = input.nextInt();
        
        boolean asal_mi = true;
        
        if(sayi<2){
            asal_mi = false;
        }else{
            for (int i = 2; i < sayi; i++) {
                if(sayi%i==0){
                    asal_mi = false;
                    break; // Artık diğer sayıları kontrol etmeye gerek yok, döngüden çık.
                }
                
            }
        }
        
        if (asal_mi){ // true ise direkt olarak burayı yapıyor , false ise else bölümüne bakıyor
            System.out.print( sayi + " Sayisi asal sayidir.");
        }else{
            System.out.print( sayi + " Asal sayi degildir.");
        }
        
        
    }
    
}
