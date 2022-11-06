package ConditionalStatementsExercise;

import java.util.Scanner;

public class Bonus_Score_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double b = 0;
        if (n <= 100){
            b = 5;
        }
        else if (n > 1000){
            b = n * 0.1;
        }
        else {
            b = n * 0.2;
        }
        if (n % 2 == 0){
            b = b + 1;
        }
        else if (n % 10 == 5){
            b = b + 2;
        }
        System.out.println(b);
        System.out.println(n + b);

    }
}
