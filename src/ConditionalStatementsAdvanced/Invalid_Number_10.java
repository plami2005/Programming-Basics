package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Invalid_Number_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean valid = n>=100 && n<=200 || n==0;
        if (!valid)System.out.println("invalid");
    }
}
