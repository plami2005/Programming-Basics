package FirstStepsExercise;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = Double.parseDouble(sc.nextLine());
        double degree = rad * 180 / Math.PI;
        System.out.println(degree);
    }
}
