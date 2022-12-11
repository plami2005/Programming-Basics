package SoftUni_Exam;

import java.util.Scanner;

public class Courier_Express_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double up = 0;
        double price_km = 0;
        double kg =Double.parseDouble(sc.nextLine());
        String usl = sc.nextLine();
        int km = Integer.parseInt(sc.nextLine());
        switch (usl){
            case "standard":
                if(kg<1){
                    price_km = km * 0.03;
                }
                else if(kg>=1 && kg<10){
                    price_km = km *0.05;
                }
                else if(kg>=10 && kg<40){
                    price_km = km * 0.1;
                }
                else if(kg>=40 && kg<90){
                    price_km = km * 0.15;
                }
                else if(kg>=90 && kg<150){
                    price_km = km *0.2;
                }
                break;
            case "express":
                if(kg<1){
                    up = kg*(0.03*0.8);
                    price_km = km * 0.03 + up*km;
                }
                else if(kg>=1 && kg<10){
                    up = kg*(0.05*0.4);
                    price_km = km *0.05 + up*km;
                }
                else if(kg>=10 && kg<40){
                    up = kg*(0.1*0.05);
                    price_km = km * 0.1 + up*km;
                }
                else if(kg>=40 && kg<90){
                    up = kg*(0.15*0.02);
                    price_km = km * 0.15 + up*km;
                }
                else if(kg>=90 && kg<150){
                    up = kg*(0.2*0.01);
                    price_km = km *0.2 + up*km;
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",kg,price_km);
    }
}
