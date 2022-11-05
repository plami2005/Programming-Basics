package FirstSteps;

import java.util.Scanner;

public class RectangleArea_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int result = a*b;
        System.out.printf("%d",result);
    }
}