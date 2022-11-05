package ConditionalStatements;

import java.util.Scanner;

public class kaka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(area(a,b));
    }
    public static int area(int a, int b){
        return a*b;
    }
}

