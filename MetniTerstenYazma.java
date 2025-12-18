package A000_denemelerim;

import java.util.Scanner;

public class MetniTerstenYazma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kelime giriniz: ");
        String girilen_kelime = input.next(); 
        
        String ters_kelime = ""; 
        
        for (int i = girilen_kelime.length() - 1; i >= 0; i--) {
            ters_kelime = ters_kelime + girilen_kelime.charAt(i);
        }
        
        System.out.println("Kelimenin tersi: " + ters_kelime);
        
        if (girilen_kelime.equals(ters_kelime)) {
            System.out.println(girilen_kelime + " bir polindromdur.");
        } else {
            System.out.println(girilen_kelime + " polindrom degildir.");
        }
        
    }
}