// hız hesaplayacağım v = v0 ​+ a⋅t
package A06_diziler_arrays;

import java.util.Scanner;

public class C09_FizikHizBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Zamani giriniz (saniye,s) : ");
        double time = input.nextDouble();

        System.out.print("ivmeyi giriniz (m/(s*s)) : ");
        double acceleration = input.nextDouble();   //acceleration ingilizcede ivme demek

        System.out.print("ilk hizi giriniz (m/s) : ");
        double startingSpeed = input.nextDouble();

        double speed = startingSpeed + (acceleration * time);
        System.out.print("Son hiziniz: " + speed + " m/s");

    }

}
