package SoftUni_Exam;

import java.util.Scanner;

public class Best_Player_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String bestplayer = "";
        int bestscore = 0;
        while (!input.equals("END")){
            String name = input;
            int goals = Integer.parseInt(sc.nextLine());
            if(goals > bestscore){
                bestplayer=name;
                bestscore=goals;
                if (goals>=10){
                    break;
                }
            }
            input =sc.nextLine();
        }
        System.out.printf("%s is the best player!%n",bestplayer);
        if(bestscore>=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",bestscore);
        }
        else{
            System.out.printf("He has scored %d goals.",bestscore);
        }
    }
}
