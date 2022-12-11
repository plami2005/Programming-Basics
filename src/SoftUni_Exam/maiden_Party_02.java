package SoftUni_Exam;

import java.util.Scanner;

public class maiden_Party_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lp = 0.6;
        double vr = 7.2;
        double k = 3.6;
        double kar = 18.2;
        double ki = 22.0;
        double price = Double.parseDouble(sc.nextLine());
        int br_lp = Integer.parseInt(sc.nextLine());
        int br_vr = Integer.parseInt(sc.nextLine());
        int br_k = Integer.parseInt(sc.nextLine());
        int br_kar = Integer.parseInt(sc.nextLine());
        int br_ki = Integer.parseInt(sc.nextLine());
        double sum = br_lp*lp+br_vr*vr+br_k*k+br_kar*kar+br_ki*ki;
        int br_sum = br_lp+br_vr+br_k+br_kar+br_ki;
        if(br_sum>=25){
            sum-=sum*0.35;
        }
        sum-=sum*0.1;
        if(sum<price){
            double needed = price-sum;
            System.out.printf("Not enough money! %.2f lv needed.",needed);
        }
        else {
            double left = sum - price;
            System.out.printf("Yes! %.2f lv left.",left);
        }
    }
}
