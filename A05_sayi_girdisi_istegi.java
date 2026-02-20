// BUNU GIDINCE DUZELT (İSTEDİĞİMİZ ARALIKTA SAYI ALMA DÖNGÜSÜNÜ METOT İLE YAPIYORUZ.)

package A01_metotlar;

import java.util.Scanner;

public class A05_sayi_girdisi_istegi {
    
    public static void assign(int sayi, int lb ,int ub){
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Lutfen sayi giriniz : ");
            sayi = input.nextInt();
        }while(sayi<lb || sayi>ub);
        
    }

    public static void main(String[] args) {
        int sayi = 0;
        assign(sayi,50,60);
        int sayi2 = 0;
        assign(sayi,0,90);
        
    }
    
}
