package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema_Ticket_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        if (d.equals("Monday")||d.equals("Tuesday")||d.equals("Friday")){
            System.out.println(12);
        }
        else if (d.equals("Wednesday")||d.equals("Thursday")){
            System.out.println(14);
        }
        else if (d.equals("Saturday")||d.equals("Sunday")){
            System.out.println(16);
        }
    }
}
