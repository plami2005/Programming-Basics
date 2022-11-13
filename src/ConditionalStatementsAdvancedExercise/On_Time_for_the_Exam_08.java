package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class On_Time_for_the_Exam_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examh = Integer.parseInt(sc.nextLine());
        int examm = Integer.parseInt(sc.nextLine());
        int arrivalh = Integer.parseInt(sc.nextLine());
        int arrivalm = Integer.parseInt(sc.nextLine());

        int examTime = examh*60+examm;
        int arrivalTime = arrivalh*60+arrivalm;
        int diff = Math.abs(arrivalTime-examTime);
        int diffHour = diff/60;
        int diffMin = diff%60;

        if(arrivalTime>examTime){
            System.out.printf("Late %n");
            if(diff>=60){
                System.out.printf("%d:%02d hours after the start",diffHour,diffMin);
            }
            else{
                System.out.printf("%d minutes after the start",diff);
            }
        }
        else if(examTime-arrivalTime<=30&&examTime!=arrivalTime){
            System.out.println("On time");
            System.out.printf("%d minutes before the start",diff);
        }
        else if(examTime==arrivalTime){
            System.out.println("On time");
        }
        else{
            System.out.printf("Early %n");
            if(diff>=60){
                System.out.printf("%d:%02d hours before the start",diffHour,diffMin);
            }
            else{
                System.out.printf("%d minutes before the start",diff);
            }
        }
    }
}
