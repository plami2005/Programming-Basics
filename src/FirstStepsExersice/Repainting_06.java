package FirstStepsExersice;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int r = Integer.parseInt(sc.nextLine());
        int ch = Integer.parseInt(sc.nextLine());
        double sum = ((n+2)*1.5)+((b+b*0.1)*14.5)+(r*5)+0.4;
        double krsum = ((sum*0.3)*ch)+sum;
        System.out.println(krsum);
    }
}
