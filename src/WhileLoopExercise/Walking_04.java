package WhileLoopExercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = 10000;
        int stepsum =0;
        while (stepsum<=goal){
           String s =sc.nextLine();
           if(s.equals("Going home")){
               int stepshome =Integer.parseInt(sc.nextLine());
               stepsum+=stepshome;
               break;
           }
            int steps=Integer.parseInt(s);
           stepsum+=steps;
        }
        if(stepsum>goal){
            int over = stepsum-goal;
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",over);
        }
        else{
            int to = goal-stepsum;
            System.out.printf("%d more steps to reach goal.",to);
        }
    }
}
