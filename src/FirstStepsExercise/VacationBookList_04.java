package FirstStepsExercise;

import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int br = Integer.parseInt(sc.nextLine());
        int str = Integer.parseInt(sc.nextLine());
        int brdn = Integer.parseInt(sc.nextLine());
        int brchas = (br/str)/brdn;
        System.out.println(brchas);
    }
}
