package FirstSteps;

import java.util.Scanner;

public class YardGardening_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kvm = Double.parseDouble(sc.nextLine());
        double rcena = kvm * 7.61;
        double ots = rcena * 0.18;
        double krcena =rcena - ots;
        System.out.println("The final price is: " + krcena + " lv.");
        System.out.println("The discount is: " + ots + " lv.");
    }
}
