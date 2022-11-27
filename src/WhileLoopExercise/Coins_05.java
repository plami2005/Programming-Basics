package WhileLoopExercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double change = Double.parseDouble(sc.nextLine());
        double coins = Math.round(change*100);
        int coinsc = 0;
        while(coins>0) {
            if (coins >= 200) {
                coins -= 200;
                coinsc++;
            } else if (coins >= 100) {
                coins -= 100;
                coinsc++;
            } else if (coins >= 50) {
                coins -= 50;
                coinsc++;
            } else if (coins >= 20) {
                coins -= 20;
                coinsc++;
            } else if (coins >= 10) {
                coins -= 10;
                coinsc++;
            } else if (coins >= 5) {
                coins -= 5;
                coinsc++;
            } else if (coins >= 2) {
                coins -= 2;
                coinsc++;
            } else if (coins >= 1) {
                coins -= 1;
                coinsc++;
            }
        }
        System.out.println(coinsc);
    }
}
