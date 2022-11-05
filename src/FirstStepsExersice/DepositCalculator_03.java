package FirstStepsExersice;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dsum = Double.parseDouble(sc.nextLine());
        int srok = Integer.parseInt(sc.nextLine());
        double godlpr = Double.parseDouble(sc.nextLine());
        double krsum = dsum + srok*((dsum*(godlpr/100))/12);
        System.out.println(krsum);

    }
}
