package WhileLoopExercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avwidth = Integer.parseInt(sc.nextLine());
        int avlength = Integer.parseInt(sc.nextLine());
        int avheight = Integer.parseInt(sc.nextLine());
        int avspace = avheight*avlength*avwidth;
        int space = 0;
        boolean noSpace = false;
        String s = sc.nextLine();
        while(!s.equals("Done")){
            int boxesc = Integer.parseInt(s);
            space+=boxesc;
            if(avspace<space){
                noSpace=true;
                break;
            }
            s = sc.nextLine();
        }
        if(noSpace){
            int more = space-avspace;
            System.out.printf("No more free space! You need %d Cubic meters more.",more);
        }
        else{
            int over = avspace-space;
            System.out.printf("%d Cubic meters left.",over);
        }
    }
}
