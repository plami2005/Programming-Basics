package FirstSteps;

import java.util.Scanner;

public class Inch_to_cm_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a =Double.parseDouble(sc.nextLine());
        double rezult = a * 2.54;
        System.out.println(rezult);
    }
}
