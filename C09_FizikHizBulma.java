//fizikteki bir problemin hesaplamasini yap ( kinetik enerji , momentum , potansiyel enerji vb ) dizi kullanma sarti ile.
//ben hız hesaplayacağım v = v0 ​+ a⋅t
package A06_diziler_arrays;

import java.util.Scanner;

public class C09_FizikHizBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ilk hizi giriniz (V0) : ");
        double startingSpeed = input.nextDouble();
        
        System.out.print("ivmeyi giriniz (a) : ");
        double acceleration = input.nextDouble();   //acceleration ingilizcede ivme demek

        System.out.print("Zamani giriniz (t) : ");
        double time = input.nextDouble();
        
        double speed = startingSpeed + (acceleration*time);
        System.out.print("Hiziniz : " + speed);

    }

}
