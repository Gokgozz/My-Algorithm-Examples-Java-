// T.C. no'su girilen (ilk on hanenin toplamının 10 ile bölümünden kalan 11. haneye eşitse TC geçerlidir) geçerli mi değil mi bul (çıkmış soru)

package A06_diziler_arrays;

import java.util.Scanner;

public class C04_TC_no {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] tc = new int[11];
        System.out.print("T.C. no kontrol sistemi");
        System.out.println();
        System.out.println();
        
        for (int i = 0; i < tc.length; i++) {
            System.out.print((i+1) + ". Haneyi giriniz : ");
            tc[i] = input.nextInt();
            while(tc[0]==0){
                System.out.print("T.c. no '0' ile baslayamaz. Gecerli rakam giriniz : ");
                tc[i] = input.nextInt();
            }
            while(tc[i]>9){
                System.out.print("Gecerli rakam giriniz : ");
                tc[i] = input.nextInt();
            }
            while(tc[i]<0){
                System.out.print("Negatif olamaz. Gecerli rakam giriniz : ");
                tc[i] = input.nextInt();
            }
        }
        
        System.out.println();
        System.out.print("Girdiginiz T.C. kimlik no: ");
        for (int i = 0; i < tc.length; i++) {
            System.out.print(tc[i]);
            
        }
        
        int ilk_on_bas_toplami = 0;
        for (int i = 0; i < tc.length-1; i++) {
            ilk_on_bas_toplami += tc[i];
            
        }
        
        System.out.println();
        
       if(ilk_on_bas_toplami%10==tc[10]){
           System.out.print("Gecerli kimlik no. giris basarili.");
       }else{
           System.out.print("Lutfen gecerli bir T.C. kimlik no giriniz");
       }
       
    }
    
}
