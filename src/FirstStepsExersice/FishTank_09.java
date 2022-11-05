package FirstStepsExersice;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.nextLine());
        int sh = Integer.parseInt(sc.nextLine());
        int v = Integer.parseInt(sc.nextLine());
        double pr = Double.parseDouble(sc.nextLine());
        double l = ((d*sh*v)*0.001)*(1-(pr/100));
        System.out.println(l);
    }
}
