package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Small_Shop_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String town = sc.nextLine();
        double q = Double.parseDouble(sc.nextLine());
        if (town.equals("Sofia")){
            switch (product){
                case "coffee": System.out.println(0.5*q);break;
                case "water": System.out.println(0.8*q);break;
                case "beer": System.out.println(1.2*q);break;
                case "sweets": System.out.println(1.45*q);break;
                case "peanuts": System.out.println(1.6*q);break;
            }
        }
        else if (town.equals("Plovdiv")){
            switch (product){
                case "coffee": System.out.println(0.4*q);break;
                case "water": System.out.println(0.7*q);break;
                case "beer": System.out.println(1.15*q);break;
                case "sweets": System.out.println(1.30*q);break;
                case "peanuts": System.out.println(1.5*q);break;
            }
        }
        else if (town.equals("Varna")){
            switch (product){
                case "coffee": System.out.println(0.45*q);break;
                case "water": System.out.println(0.7*q);break;
                case "beer": System.out.println(1.1*q);break;
                case "sweets": System.out.println(1.35*q);break;
                case "peanuts": System.out.println(1.55*q);break;
            }
        }
    }
}
