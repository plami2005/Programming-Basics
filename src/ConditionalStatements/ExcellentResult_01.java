package ConditionalStatements;

import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        if(n >= 5){
            System.out.println("Excellent!");
        }
    }
}
