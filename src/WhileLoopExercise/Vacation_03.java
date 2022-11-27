package WhileLoopExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyneeded = Double.parseDouble(sc.nextLine());
        double moneyhave = Double.parseDouble(sc.nextLine());
        int dayc = 0;
        int spendc = 0;
        while (moneyhave<moneyneeded && spendc<5) {
            String com = sc.nextLine();
            double money = Double.parseDouble(sc.nextLine());
            dayc++;

            if ("save".equals(com)) {
                moneyhave += money;
                spendc = 0;
            } else if ("spend".equals(com)) {
                moneyhave -= money;
                spendc += 1;
                if (moneyhave < 0) {
                    moneyhave = 0;
                }
            }
        }
        if (spendc==5){
            System.out.println("You can't save the money.");
            System.out.println(dayc);
        }
        if(moneyhave>=moneyneeded){
            System.out.printf("You saved the money for %d days.",dayc);
        }
    }
}
