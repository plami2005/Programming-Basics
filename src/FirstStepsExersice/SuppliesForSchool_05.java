package FirstStepsExersice;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());
        double pr = Double.parseDouble(sc.nextLine());
        double sum = ((h*5.8)+(m*7.2)+(p*1.2));
        double krsum = sum - (sum*(pr/100));
        System.out.println(krsum);

    }
}
