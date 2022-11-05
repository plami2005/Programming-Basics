package FirstSteps;

import java.util.Scanner;

public class ConcatenareData_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firsname = sc.nextLine();
        String lastname = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String town = sc.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",
                firsname, lastname, age, town);
    }
}
