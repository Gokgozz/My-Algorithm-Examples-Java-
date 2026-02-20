package A01_metotlar;

import java.util.Random;

public class A06_dizideki_en_buyuk_kucuk_sayi_metot {
    
     public static int[] array_creator(int N){
        Random rnd = new Random();
        int[] dizi = new int[N];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(50);
        }
  
        return dizi;
    }
    

    public static int findmin(int[] x){
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if(x[i]<min){
                min = x[i];
            }
        }
        //System.out.println("Minimum: "+min);
        return min;
    }
    
    public static int findmax(int[] x){
        int max = x[0];
        for (int i = 1; i < x.length; i++) {
            if(x[i]>max){
                max = x[i];
            }
        }
        //System.out.println("Maksimum: "+max);
        return max;
    }
    
    public static void dotproduct(int[] a,int[] b){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i]*b[i];
        }
        System.out.println("Vektörlerin skalar çarpım: "+result);
    }
    
    public static void main(String[] args) {
        int[] x = {5,1,10,6,8,3};
        int enkucuk = findmin(x);
        int enbuyuk = findmax(x);
        System.out.println((enbuyuk+enkucuk)/2);
        
        int[] dizi1 = array_creator(6);
        int[] dizi2 = array_creator(6);
        dotproduct(dizi1,dizi2);
        dotproduct(x,dizi2);
        dotproduct(x,dizi1);
    }
    
}
