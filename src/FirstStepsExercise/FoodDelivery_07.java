package FirstStepsExercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p =Integer.parseInt(sc.nextLine());
        int r =Integer.parseInt(sc.nextLine());
        int v =Integer.parseInt(sc.nextLine());
        double sum = p*10.35 + r*12.40 + v*8.15;
        double krsum =(sum*0.2) + sum + 2.5;
        System.out.println(krsum);
    }
}
