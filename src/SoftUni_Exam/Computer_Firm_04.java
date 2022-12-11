package SoftUni_Exam;

import java.util.Scanner;

public class Computer_Firm_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double br_sale=0;
        double sum_rate = 0;
        double sums=0;
        double sumr=0;
        int n = Integer.parseInt(sc.nextLine());
        for (int i =1 ; i<=n ; i++){
            int inp = Integer.parseInt(sc.nextLine());
            int rate = inp % 10;
            int sale = inp / 10;
            switch (rate){
                case 2:
                    br_sale = 0;
                    sum_rate = 2;
                    break;
                case 3:
                    br_sale = sale * 0.5;
                    sum_rate = 3;
                    break;
                case 4:
                    br_sale = sale * 0.7;
                    sum_rate = 4;
                    break;
                case 5:
                    br_sale = sale * 0.85;
                    sum_rate = 5;
                    break;
                case 6:
                    br_sale = sale;
                    sum_rate = 6;
                    break;
            }
             sums += br_sale;
             sumr += sum_rate;
        }
        System.out.printf("%.2f%n",sums);
        System.out.printf("%.2f",sumr/n);
    }
}
