package ConditionalStatementsExercise;

import java.util.Scanner;

public class Sum_Seconds_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = Integer.parseInt(sc.nextLine());
        int t2 = Integer.parseInt(sc.nextLine());
        int t3 = Integer.parseInt(sc.nextLine());
        int total = t1 + t2 + t3;
        int min = total / 60;
        int sec = total % 60;
        if (sec < 10){
            System.out.printf("%d:0%d", min, sec);
        }
        else {
            System.out.printf("%d:%d", min, sec);
        }

    }
}
