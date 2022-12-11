package SoftUni_Exam;

import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int br_nights = Integer.parseInt(sc.nextLine());
        int br_cards = Integer.parseInt(sc.nextLine());
        int br_museum = Integer.parseInt(sc.nextLine());
        int nights = br_nights*20;
        double cards = br_cards*1.6;
        int museum = br_museum*6;
        double people_sum=people*(nights+cards+museum);
        double sum = people_sum+(people_sum*0.25);
        System.out.printf("%.2f",sum);
    }
}
