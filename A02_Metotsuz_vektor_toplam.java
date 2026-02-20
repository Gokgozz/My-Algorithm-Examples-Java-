package A01_metotlar;

import java.util.Random;

public class A02_Metotsuz_vektor_toplam {

    public static void main(String[] args) {
        Random rnd = new Random();
        
        int[] vektorX = new int[5];
        int[] vektorY = new int[5];
        
        for (int i = 0; i < vektorX.length; i++) {
            vektorX[i] = rnd.nextInt(10);
        }
        for (int i = 0; i < vektorY.length; i++) {
            vektorY[i] = rnd.nextInt(10);
        }
        
        System.out.print("X vektoru : [ ");
        for (int i = 0; i < vektorX.length; i++) {
            if(i==vektorX.length-1){
                System.out.print(vektorX[i] + " ]");
            }else{
                System.out.print(vektorX[i] + ", ");
            }
            
        }
        
        System.out.println();
        
        System.out.print("Y vektoru : [ ");
        for (int i = 0; i < vektorY.length; i++) {
            if(i==vektorY.length-1){
                System.out.print(vektorY[i] + " ]");
            }else{
                System.out.print(vektorY[i] + ", ");
            }
            
        }
        
        System.out.println();
        
        int[] vektorToplam = new int[5];
        for (int i = 0; i < vektorToplam.length; i++) {
            vektorToplam[i] = vektorX[i] + vektorY[i];
        }
        
        System.out.print("Iki vektorun toplami : [ ");
        for (int i = 0; i < vektorToplam.length; i++) {
            if(i==vektorToplam.length-1){
                System.out.print(vektorToplam[i] + " ]");
            }else{
                System.out.print(vektorToplam[i] + ", ");
            }
            
        }
        
        // BURADA KOD ÇOK UZADI BUNU METOT İLE KISALT. ALGO TEKRARI YAP.
        
    }
    
}
