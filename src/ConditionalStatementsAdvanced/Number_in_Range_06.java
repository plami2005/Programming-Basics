package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Number_in_Range_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        if (n<=100 && n>=-100 && n!=0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
