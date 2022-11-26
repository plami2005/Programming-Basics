package WhileLoop;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int years = 1;
        double sum = 0;
        double byears = 0;
        while (years <= 12) {
            if (byears == 2) {
                break;
            }
            double grade = Double.parseDouble(sc.nextLine());
            if (grade < 4) {
                byears++;
                continue;
            }
            sum += grade;
            years++;
        }
        if (byears == 2) {
            System.out.printf("%s has been excluded at %d grade", name, years);
        } else {
            double averageGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}
