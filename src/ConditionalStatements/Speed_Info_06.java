package ConditionalStatements;

import java.util.Scanner;

public class Speed_Info_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = Double.parseDouble(sc.nextLine());
        if (v <= 10){
            System.out.println("slow");
        }
        else if (v > 10 && v <= 50){
            System.out.println("average");
        }
        else if (v > 50 && v <= 150){
            System.out.println("fast");
        }
        else if (v > 150 && v <= 1000){
            System.out.println("ultra fast");
        }
        else {
            System.out.println("extremely fast");
        }
    }
}
