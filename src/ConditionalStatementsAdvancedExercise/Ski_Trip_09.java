package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Ski_Trip_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.nextLine());
        String ac = sc.nextLine();
        String f = sc.nextLine();
        int n = d-1;
        double price = 0;
        switch (ac){
            case "room for one person":
                price = 18.00*n;
                break;
            case "apartment":
                price = 25.00*n;
                if(n<10){
                    price-=price*0.3;
                }
                else if(n>=10&&n<=15){
                    price-=price*0.35;
                }
                else {
                    price-=price*0.5;
                }
                break;
            case "president apartment":
                price=35.00*n;
                if(n<10){
                    price-=price*0.1;
                }
                else if (n>=10&&n<=15){
                    price-=price*0.15;
                }
                else{
                    price-=price*0.2;
                }
                break;
        }
        switch (f){
            case "positive":
                price+=price*0.25;
                break;
            case "negative":
                price-=price*0.10;
                break;
        }
        System.out.printf("%.2f",price);
    }
}
