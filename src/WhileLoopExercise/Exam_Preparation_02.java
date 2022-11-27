package WhileLoopExercise;

import java.util.Scanner;

public class Exam_Preparation_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bgrade = Integer.parseInt(sc.nextLine());
        int ftimes = 0;
        int solvedc= 0;
        double grades=0;
        String last = "";
        boolean fail = true;
        while (ftimes<bgrade){
            String name = sc.nextLine();
            if("Enough".equals(name)){
                fail = false;
                break;
            }
            int grade = Integer.parseInt(sc.nextLine());
            if(grade<=4){
                ftimes++;
            }
            grades +=grade;
            solvedc++;
            last = name;
        }
        if(fail){
            System.out.printf("You need a break, %d poor grades.",bgrade);
        }
        else {
            System.out.printf("Average score: %.2f%n",grades/solvedc);
            System.out.printf("Number of problems: %d%n",solvedc);
            System.out.printf("Last problem: %s",last);

        }
    }
}
