// N tane vatandaşın notunu girin ortalamanın altında olanlar kaldı üstünde olanlar geçti

package A06_diziler_arrays;

import java.util.Scanner;

public class C02_gectiMi_kaldiMi_puan {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sinava giren kisi sayisi(N) : ");
        int N = input.nextInt();
        
        int[] puan = new int[N];
        
        int toplam_puan = 0;
        
        for (int i = 0; i < puan.length; i++) {
            
            System.out.print((i+1) + ". Kisinin Puanini Giriniz : ");
            puan[i] = input.nextInt();
            toplam_puan += puan[i];
            
        }
        double ortalama = (double) toplam_puan / N;
        
        System.out.println();
        System.out.println("Toplam Puan : " + toplam_puan);
        System.out.println("Ortalama Puan : " + ortalama);
        System.out.println();
        
        for (int i = 0; i < N; i++) {
            int kisi_no = i + 1;
            
            if(puan[i] >= ortalama){
                System.out.println(kisi_no + ". Kisi (Puan: " + puan[i] + ") --> TEBRIKLER! Gectiniz.");
            }else{
                System.out.println(kisi_no + ". Kisi (Puan: " + puan[i] + ") --> MALESEF Kaldiniz.");
            }
            
        }
        
        
        

    }
    
}
