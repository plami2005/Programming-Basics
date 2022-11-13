package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        int r = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        double i = 0;
        if (p.equals("Premiere")){
            i = r * c * 12;
        }
        else if (p.equals("Normal")){
            i = r * c * 7.5;
        }
        else if (p.equals("Discount")){
            i = r * c * 5;
        }
        System.out.printf("%.2f leva", i);
    }
}
