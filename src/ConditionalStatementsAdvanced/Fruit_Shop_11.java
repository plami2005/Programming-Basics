package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Fruit_Shop_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String day = sc.nextLine();
        double q = Double.parseDouble(sc.nextLine());
        double price = 0;
        if (day.equals("Monday")||day.equals("Tuesday")|| day.equals("Wednesday")||day.equals("Thursday")|| day.equals("Friday")) {
            switch (name) {
                case "banana":
                    price = (2.5 * q);
                    break;
                case "apple":
                    price =(1.2 * q);
                    break;
                case "orange":
                    price =(0.85 * q);
                    break;
                case "grapefruit":
                    price =(1.45 * q);
                    break;
                case "kiwi":
                    price =(2.7 * q);
                    break;
                case "pineapple":
                    price =(5.5 * q);
                    break;
                case "grapes":
                    price =(3.85 * q);
                    break;
                default: System.out.println("error");
            }
        }
        else  if (day.equals("Saturday")||day.equals("Sunday")) {
            switch (name) {
                case "banana":
                    price =(2.7 * q);
                    break;
                case "apple":
                    price =(1.25 * q);
                    break;
                case "orange":
                    price =(0.9 * q);
                    break;
                case "grapefruit":
                    price =(1.6 * q);
                    break;
                case "kiwi":
                    price =(3 * q);
                    break;
                case "pineapple":
                    price =(5.6 * q);
                    break;
                case "grapes":
                    price =(4.2 * q);
                    break;
                default: System.out.println("error");
            }
        }
        else System.out.println("error");
        if(price>0){
            System.out.printf("%.2f",price);
        }
    }

}
