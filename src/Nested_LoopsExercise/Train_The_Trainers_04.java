package Nested_LoopsExercise;

import java.util.Scanner;

public class Train_The_Trainers_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jury = Integer.parseInt(sc.nextLine());
        String inp = sc.nextLine();
        double total = 0;
        int prc = 0;

        while (!inp.equals("Finish")) {
            prc++;
            double sum = 0;
            String pr = inp;
            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(sc.nextLine());
                sum += grade;
                total += grade;
            }
            double avg = sum / jury;
            System.out.printf("%s - %.2f.%n", pr, avg);
            inp = sc.nextLine();
        }
        double totalavg = total / (jury * prc);
        System.out.printf("Student's final assessment is %.2f.", totalavg);
    }
}