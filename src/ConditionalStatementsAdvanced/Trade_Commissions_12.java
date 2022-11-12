package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Trade_Commissions_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sity = sc.nextLine();
        double s = Double.parseDouble(sc.nextLine());
        double k = 0;
        if(sity.equals("Sofia")){
            if(s>=0&&s<=500){
               k=s*0.05;
                System.out.printf("%.2f",k);
            }
            else if (s>500&&s<=1000){
                k=s*0.07;
                System.out.printf("%.2f",k);
            }
            else if (s>1000&&s<=10000){
                k=s*0.08;
                System.out.printf("%.2f",k);
            }
            else if (s>10000){
                k=s*0.12;
                System.out.printf("%.2f",k);
            }
            else {
                System.out.println("error");
            }
        }
        else if(sity.equals("Varna")){
            if(s>=0&&s<=500){
                k=s*0.045;
                System.out.printf("%.2f",k);
            }
            else if (s>500&&s<=1000){
                k=s*0.075;
                System.out.printf("%.2f",k);
            }
            else if (s>1000&&s<=10000){
                k=s*0.1;
                System.out.printf("%.2f",k);
            }
            else if (s>10000){
                k=s*0.13;
                System.out.printf("%.2f",k);
            }
            else {
                System.out.println("error");
            }
        }
        else if(sity.equals("Plovdiv")){
            if(s>=0&&s<=500){
                k=s*0.055;
                System.out.printf("%.2f",k);
            }
            else if (s>500&&s<=1000){
                k=s*0.08;
                System.out.printf("%.2f",k);
            }
            else if (s>1000&&s<=10000){
                k=s*0.12;
                System.out.printf("%.2f",k);
            }
            else if (s>10000){
                k=s*0.145;
                System.out.printf("%.2f",k);
            }
            else {
                System.out.println("error");
            }
        }
        else System.out.println("error");
    }
}
