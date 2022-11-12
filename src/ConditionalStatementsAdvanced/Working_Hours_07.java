package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Working_Hours_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine());
        String d = sc.nextLine();
        if (h>=10 && h<=18){
            switch (d){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");break;
                case "Sunday":
                    System.out.println("closed");break;
            }
        }
        else System.out.println("closed");
    }
}
