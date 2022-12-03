package Nested_Loops;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        while(!inp.equals("End")){
            String dest = inp;
            double bud = Double.parseDouble(sc.nextLine());
            double saved = 0;
            while(saved<bud){
                double cur = Double.parseDouble(sc.nextLine());
                saved+=cur;
            }
            System.out.printf("Going to %s!%n",dest);
            inp = sc.nextLine();
        }
    }
}
