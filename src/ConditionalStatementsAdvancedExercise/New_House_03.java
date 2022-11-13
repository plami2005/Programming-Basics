package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class New_House_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 5.00;
        double d = 3.80;
        double t = 2.80;
        double n = 3.00;
        double g = 2.50;
        String flower = sc.nextLine();
        int br = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double price = 0;
        switch (flower){
            case "Roses":
                price = br*r;
                if(br>80){
                    price-=price*0.10;
                }
                break;
            case "Dahlias":
                price = br*d;
                if(br>90){
                    price-=price*0.15;
                }
                break;
            case "Tulips":
                price = br*t;
                if(br>80){
                    price-=price*0.15;
                }
                break;
            case "Narcissus":
                price = br*n;
                if(br<120){
                    price+=price*0.15;
                }
                break;
            case "Gladiolus":
                price = br*g;
                if(br<80){
                    price+=price*0.20;
                }
                break;
        }
        if(price<=budget){
            double e = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", br, flower,e);
        }
        else{
            double s = price-budget;
            System.out.printf("Not enough money, you need %.2f leva more.", s);
        }

    }
}
